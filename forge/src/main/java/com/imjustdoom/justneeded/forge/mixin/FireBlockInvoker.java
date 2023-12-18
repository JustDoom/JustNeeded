package com.imjustdoom.justneeded.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FireBlock;

@Mixin(FireBlock.class)
public interface FireBlockInvoker {

    @Invoker("setFlammable")
    void invokeSetFlammable(Block block, int a, int b);
}