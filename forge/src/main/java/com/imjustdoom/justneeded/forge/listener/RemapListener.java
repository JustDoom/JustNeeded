package com.imjustdoom.justneeded.forge.listener;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RemapListener {

    @SubscribeEvent
    public static void missingItemMappings(MissingMappingsEvent event) {

        for (MissingMappingsEvent.Mapping<Item> entry : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
            switch (entry.getKey().toString()) {
                case JustNeeded.MOD_ID + ":dirt_stairs_item" -> entry.remap(ModBlocks.DIRT_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":glowstone_stairs_item" -> entry.remap(ModBlocks.GLOWSTONE_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":sugar_cane_stairs_item" -> entry.remap(ModBlocks.SUGAR_CANE_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":sand_stairs_item" -> entry.remap(ModBlocks.SAND_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":red_sand_stairs_item" -> entry.remap(ModBlocks.RED_SAND_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":gravel_stairs_item" -> entry.remap(ModBlocks.GRAVEL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":white_wool_stairs_item" -> entry.remap(ModBlocks.WHITE_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":orange_wool_stairs_item" -> entry.remap(ModBlocks.ORANGE_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":magenta_wool_stairs_item" -> entry.remap(ModBlocks.MAGENTA_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":light_blue_wool_stairs_item" -> entry.remap(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":yellow_wool_stairs_item" -> entry.remap(ModBlocks.YELLOW_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":lime_wool_stairs_item" -> entry.remap(ModBlocks.LIME_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":pink_wool_stairs_item" -> entry.remap(ModBlocks.PINK_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":gray_wool_stairs_item" -> entry.remap(ModBlocks.GRAY_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":light_gray_wool_stairs_item" -> entry.remap(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":cyan_wool_stairs_item" -> entry.remap(ModBlocks.CYAN_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":purple_wool_stairs_item" -> entry.remap(ModBlocks.PURPLE_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":blue_wool_stairs_item" -> entry.remap(ModBlocks.BLUE_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":brown_wool_stairs_item" -> entry.remap(ModBlocks.BROWN_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":green_wool_stairs_item" -> entry.remap(ModBlocks.GREEN_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":red_wool_stairs_item" -> entry.remap(ModBlocks.RED_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":black_wool_stairs_item" -> entry.remap(ModBlocks.BLACK_WOOL_STAIRS.get().asItem());
                case JustNeeded.MOD_ID + ":dirt_slab_item" -> entry.remap(ModBlocks.DIRT_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":glowstone_slab_item" -> entry.remap(ModBlocks.GLOWSTONE_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":sand_slab_item" -> entry.remap(ModBlocks.SAND_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":red_sand_slab_item" -> entry.remap(ModBlocks.RED_SAND_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":gravel_slab_item" -> entry.remap(ModBlocks.GRAVEL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":white_wool_slab_item" -> entry.remap(ModBlocks.WHITE_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":orange_wool_slab_item" -> entry.remap(ModBlocks.ORANGE_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":magenta_wool_slab_item" -> entry.remap(ModBlocks.MAGENTA_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":light_blue_wool_slab_item" -> entry.remap(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":yellow_wool_slab_item" -> entry.remap(ModBlocks.YELLOW_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":lime_wool_slab_item" -> entry.remap(ModBlocks.LIME_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":pink_wool_slab_item" -> entry.remap(ModBlocks.PINK_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":gray_wool_slab_item" -> entry.remap(ModBlocks.GRAY_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":light_gray_wool_slab_item" -> entry.remap(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":cyan_wool_slab_item" -> entry.remap(ModBlocks.CYAN_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":purple_wool_slab_item" -> entry.remap(ModBlocks.PURPLE_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":blue_wool_slab_item" -> entry.remap(ModBlocks.BLUE_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":brown_wool_slab_item" -> entry.remap(ModBlocks.BROWN_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":green_wool_slab_item" -> entry.remap(ModBlocks.GREEN_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":red_wool_slab_item" -> entry.remap(ModBlocks.RED_WOOL_SLAB.get().asItem());
                case JustNeeded.MOD_ID + ":black_wool_slab_item" -> entry.remap(ModBlocks.BLACK_WOOL_SLAB.get().asItem());
            }
        }
    }
}