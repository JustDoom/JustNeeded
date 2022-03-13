package com.imjustdoom.justneeded.items;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.blocks.BlockInit;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class JustNeededGroup {
    public static final ItemGroup JUST_NEEDED = FabricItemGroupBuilder.build(new Identifier(JustNeeded.MOD_ID, "justneededtab"),
            () -> new ItemStack(BlockInit.SPIDER_EYE_BLOCK));
}
