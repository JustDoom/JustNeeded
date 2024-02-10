package com.imjustdoom.justneeded.fabric;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class JustNeededFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        JustNeeded.init();

        FlammableBlockRegistry flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();
        flammableBlockRegistry.add(ModBlocks.SUGAR_CANE_BLOCK.get(), 5, 20);
        flammableBlockRegistry.add(ModBlocks.SUGAR_CANE_SLAB.get(), 5, 20);
        flammableBlockRegistry.add(ModBlocks.SUGAR_CANE_STAIRS.get(), 5, 20);

        flammableBlockRegistry.add(ModBlocks.WHITE_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.ORANGE_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.MAGENTA_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.YELLOW_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIME_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.PINK_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.GRAY_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.CYAN_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.PURPLE_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BLUE_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BROWN_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.GREEN_WOOL_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.RED_SAND_STAIRS.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BLACK_WOOL_STAIRS.get(), 30, 60);

        flammableBlockRegistry.add(ModBlocks.WHITE_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.ORANGE_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.MAGENTA_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.YELLOW_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIME_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.PINK_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.GRAY_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.CYAN_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.PURPLE_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BLUE_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BROWN_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.GREEN_WOOL_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.RED_SAND_SLAB.get(), 30, 60);
        flammableBlockRegistry.add(ModBlocks.BLACK_WOOL_SLAB.get(), 30, 60);
    }
}
