package com.imjustdoom.justneeded.datagen;

import com.imjustdoom.justneeded.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.SPIDER_EYE_BLOCK.get());
        dropSelf(ModBlocks.SUGAR_CANE_BLOCK.get());

        // Stairs
        dropSelf(ModBlocks.DIRT_STAIRS.get());
        dropSelf(ModBlocks.GRASS_STAIRS.get());
        dropSelf(ModBlocks.GLOWSTONE_STAIRS.get());
        dropSelf(ModBlocks.SUGAR_CANE_STAIRS.get());
        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS.get());
        
        // Stairs - Gravity
        dropSelf(ModBlocks.SAND_STAIRS.get());
        dropSelf(ModBlocks.RED_SAND_STAIRS.get());
        dropSelf(ModBlocks.GRAVEL_STAIRS.get());

        // Stairs - Wool
        dropSelf(ModBlocks.WHITE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIME_WOOL_STAIRS.get());
        dropSelf(ModBlocks.PINK_WOOL_STAIRS.get());
        dropSelf(ModBlocks.GRAY_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        dropSelf(ModBlocks.CYAN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BLUE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BROWN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.GREEN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.RED_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BLACK_WOOL_STAIRS.get());
        
        // Slabs
        dropSelf(ModBlocks.DIRT_SLAB.get());
        dropSelf(ModBlocks.GRASS_SLAB.get());
        dropSelf(ModBlocks.GLOWSTONE_SLAB.get());
        dropSelf(ModBlocks.SUGAR_CANE_SLAB.get());

        // Slabs - Gravity
        dropSelf(ModBlocks.SAND_SLAB.get());
        dropSelf(ModBlocks.RED_SAND_SLAB.get());
        dropSelf(ModBlocks.GRAVEL_SLAB.get());
        
        // Slabs - Wool
        add(ModBlocks.WHITE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.WHITE_WOOL_SLAB.get()));
        add(ModBlocks.ORANGE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.ORANGE_WOOL_SLAB.get()));
        add(ModBlocks.MAGENTA_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.MAGENTA_WOOL_SLAB.get()));
        add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get()));
        add(ModBlocks.YELLOW_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.YELLOW_WOOL_SLAB.get()));
        add(ModBlocks.LIME_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIME_WOOL_SLAB.get()));
        add(ModBlocks.PINK_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.PINK_WOOL_SLAB.get()));
        add(ModBlocks.GRAY_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.GRAY_WOOL_SLAB.get()));
        add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get()));
        add(ModBlocks.CYAN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.CYAN_WOOL_SLAB.get()));
        add(ModBlocks.PURPLE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.PURPLE_WOOL_SLAB.get()));
        add(ModBlocks.BLUE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BLUE_WOOL_SLAB.get()));
        add(ModBlocks.BROWN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BROWN_WOOL_SLAB.get()));
        add(ModBlocks.GREEN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.GREEN_WOOL_SLAB.get()));
        add(ModBlocks.RED_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.RED_WOOL_SLAB.get()));
        add(ModBlocks.BLACK_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BLACK_WOOL_SLAB.get()));
    }
}
