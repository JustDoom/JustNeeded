package com.imjustdoom.justneeded.block.custom;

import com.imjustdoom.justneeded.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

public class GrassSlab extends SlabBlock {

    public GrassSlab(Properties properties) {
        super(properties);
    }

    private static boolean canBeGrass(BlockState arg, LevelReader arg2, BlockPos arg3) {
        BlockPos blockpos = arg3.above();
        BlockState blockstate = arg2.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(arg2, arg, arg3, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(arg2, blockpos));
            return i < arg2.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState arg, LevelReader arg2, BlockPos arg3) {
        BlockPos blockpos = arg3.above();
        return canBeGrass(arg, arg2, arg3) && !arg2.getFluidState(blockpos).is(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState arg, ServerLevel arg2, BlockPos arg3, RandomSource arg4) {
        if (!canBeGrass(arg, arg2, arg3)) {
            if (!arg2.isLoaded(arg3)) {
                return;
            }

//            arg2.setBlockAndUpdate(arg3, BlockInit.DIRT_SLAB.get().defaultBlockState());
        } else {
            if (!arg2.isLoaded(arg3)) {
                return;
            }

            if (arg2.getMaxLocalRawBrightness(arg3.above()) >= 9) {
                BlockState blockstate = this.defaultBlockState();

                for(int i = 0; i < 4; ++i) {
                    BlockPos blockpos = arg3.offset(arg4.nextInt(3) - 1, arg4.nextInt(5) - 3, arg4.nextInt(3) - 1);
                    if (arg2.getBlockState(blockpos).is(ModBlocks.DIRT_SLAB.get()) && canPropagate(blockstate, arg2, blockpos)) {
                        BlockState me = arg2.getBlockState(blockpos);
                        arg2.setBlockAndUpdate(blockpos, ModBlocks.GRASS_SLAB.get().defaultBlockState().setValue(TYPE, me.getValue(TYPE)));
//                        arg2.setBlockAndUpdate(blockpos, blockstate.setValue(SNOWY, arg2.getBlockState(blockpos.above()).is(Blocks.SNOW)));
                    }
                }
            }
        }
    }
}
