package com.imjustdoom.justneeded.platform;

import net.minecraft.world.level.storage.loot.LootPool;

public interface LootPoolModifier {
    void addPool(LootPool pool);
}
