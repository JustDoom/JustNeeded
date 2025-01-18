package com.imjustdoom.justneeded.fabric;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.ModBlocks;
import com.imjustdoom.justneeded.item.ModItems;
import com.imjustdoom.justneeded.platform.FabricLootPoolModifier;
import com.imjustdoom.justneeded.platform.FabricPlatformHelper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootDataManager;
import net.minecraft.world.level.storage.loot.LootTable;

public class JustNeededFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreativeModeTab tab = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.COOKED_EGG.get()))
                .title(Component.translatable("category.justneeded.justneeded_tab"))
                .displayItems((context, entries) -> {
                    BuiltInRegistries.ITEM.stream()
                            .filter(item -> BuiltInRegistries.ITEM.getKey(item).getNamespace().equals(JustNeeded.MOD_ID))
                            .forEach(entries::accept);
                })
                .build();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(JustNeeded.MOD_ID, "villagerinabucket_tab"), tab);

        JustNeeded.init(tab);

        LootTableEvents.MODIFY.register((ResourceManager resourceManager, LootDataManager lootManager, ResourceLocation id, LootTable.Builder tableBuilder, LootTableSource source) -> JustNeeded.modifyLootTables(new FabricLootPoolModifier(tableBuilder), id));

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
