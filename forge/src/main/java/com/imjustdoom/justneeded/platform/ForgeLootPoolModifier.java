package com.imjustdoom.justneeded.platform;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;

public class ForgeLootPoolModifier implements LootPoolModifier {
    LootTable table;

    public ForgeLootPoolModifier(LootTable table) {
        this.table = table;
    }

    @Override
    public void addPool(LootPool pool) {
        this.table.addPool(pool);
    }
}
