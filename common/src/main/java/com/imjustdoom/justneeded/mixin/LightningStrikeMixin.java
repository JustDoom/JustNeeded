package com.imjustdoom.justneeded.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightningBolt.class)
public abstract class LightningStrikeMixin extends Entity {
    public LightningStrikeMixin(EntityType<?> type, Level level) {
        super(type, level);
    }

    @Inject(method = "tick", at = @At(
            value = "INVOKE_ASSIGN",
            target = "Lnet/minecraft/world/level/Level;getEntities(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;",
            ordinal = 1,
            by = 1
    ))
    public void handleLightning(CallbackInfo ci) {
        if (this.isRemoved() || level().isClientSide) {
            return;
        }

        BlockPos blockPos = BlockPos.containing(position()).below();
        Block block = level().getBlockState(blockPos).getBlock();
        if (block == Blocks.LIGHTNING_ROD) {
            blockPos = blockPos.below();
            block = level().getBlockState(blockPos).getBlock();
        }

        if (block == Blocks.SAND) {
            level().setBlock(blockPos, Blocks.GLASS.defaultBlockState(), 3);
        } else if (block == Blocks.RED_SAND) {
            level().setBlock(blockPos, Blocks.RED_STAINED_GLASS.defaultBlockState(), 3);
        }
    }
}
