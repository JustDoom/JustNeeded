package com.imjustdoom.justneeded.platform;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;

public class FabricLootPoolModifier implements LootPoolModifier {
    LootTable.Builder builder;

    public FabricLootPoolModifier(LootTable.Builder builder) {
        this.builder = builder;
    }

    @Override
    public void addPool(LootPool pool) {
        this.builder.pool(pool);
    }
}
