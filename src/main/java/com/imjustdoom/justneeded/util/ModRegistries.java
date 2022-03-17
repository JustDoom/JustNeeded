package com.imjustdoom.justneeded.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Items.PAPER, 80);
        registry.add(Items.BOOK, 255);
        registry.add(Items.WRITTEN_BOOK, 255);
        registry.add(Items.WRITABLE_BOOK, 255);
        registry.add(Items.MAP, 80);
        registry.add(Items.FILLED_MAP, 80);
        registry.add(Items.HAY_BLOCK, 3745);
        registry.add(Items.ACACIA_LEAVES, 85);
        registry.add(Items.BIRCH_LEAVES, 85);
        registry.add(Items.DARK_OAK_LEAVES, 85);
        registry.add(Items.JUNGLE_LEAVES, 85);
        registry.add(Items.OAK_LEAVES, 85);
        registry.add(Items.SPRUCE_LEAVES, 85);
        registry.add(Items.GRASS, 90);
        registry.add(Items.FERN, 90);
        registry.add(Items.LARGE_FERN, 90);
        registry.add(Items.TALL_GRASS, 90);
        registry.add(Items.VINE, 90);
    }
}
