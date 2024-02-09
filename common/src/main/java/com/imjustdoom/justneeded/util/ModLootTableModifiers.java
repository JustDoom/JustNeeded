package com.imjustdoom.justneeded.util;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {

    public static final ResourceLocation JUNGLE_TEMPLE_DISPENSER = new ResourceLocation("minecraft", "chests/jungle_temple_dispenser");

    public static void modifyLootTables() {
        LootEvent.MODIFY_LOOT_TABLE.register((dataManager, resourceLocation, context, builtIn) -> {
            if (JUNGLE_TEMPLE_DISPENSER.equals(resourceLocation)) {

                LootPool.Builder builder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1))
                        .add(LootItem.lootTableItem(Items.TIPPED_ARROW))
                        .apply(SetPotionFunction.setPotion(Potions.POISON))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 4)));

                context.addPool(builder.build());
            }
        });
    }
}
