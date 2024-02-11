package com.imjustdoom.justneeded.block.custom;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class WoolStairs extends StairBlock {

    public WoolStairs(Supplier<BlockState> state, BlockBehaviour.Properties properties) {
        super(state.get(), properties);
    }
}