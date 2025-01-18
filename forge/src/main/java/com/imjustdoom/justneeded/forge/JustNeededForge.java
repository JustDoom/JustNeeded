package com.imjustdoom.justneeded.forge;

import com.imjustdoom.justneeded.platform.ForgeLootPoolModifier;
import com.imjustdoom.justneeded.platform.ForgeWrapper;
import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.ModBlocks;
import com.imjustdoom.justneeded.item.ModItems;
import com.imjustdoom.justneeded.mixin.FireBlockInvoker;
import com.imjustdoom.justneeded.platform.ForgePlatformHelper;
import com.imjustdoom.justneeded.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

@Mod(JustNeeded.MOD_ID)
public class JustNeededForge {
    private static final List<ForgeWrapper<Item>> REGISTERED_ITEMS = new ArrayList<>();

    public JustNeededForge() {

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener((FMLCommonSetupEvent e) -> {
            FireBlockInvoker invoker = ((FireBlockInvoker) Blocks.FIRE);
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_BLOCK.get(), 5, 20);
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_SLAB.get(), 5, 20);
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_STAIRS.get(), 5, 20);

            invoker.invokeSetFlammable(ModBlocks.WHITE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.ORANGE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.MAGENTA_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.YELLOW_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIME_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PINK_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.CYAN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PURPLE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BROWN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GREEN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.RED_SAND_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLACK_WOOL_STAIRS.get(), 30, 60);

            invoker.invokeSetFlammable(ModBlocks.WHITE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.ORANGE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.MAGENTA_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.YELLOW_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIME_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PINK_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.CYAN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PURPLE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BROWN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GREEN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.RED_SAND_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLACK_WOOL_SLAB.get(), 30, 60);
        });

        CreativeModeTab tab = CreativeModeTab.builder()
                .title(Component.translatable("category.justneeded.justneeded_tab"))
                .icon(() -> new ItemStack(ModItems.COOKED_EGG.get()))
                .build();

        Services.PLATFORM.registerTab("villagerinabucket_tab", tab);

        ModItems.init();
        ModBlocks.init();

        ForgePlatformHelper.ITEMS.register(modBus);
        ForgePlatformHelper.BLOCKS.register(modBus);
        ForgePlatformHelper.TABS.register(modBus);

        modBus.addListener(JustNeededForge::buildContents);

        JustNeeded.init(tab);
    }

    public static void registerItem(ForgeWrapper<Item> item) {
        REGISTERED_ITEMS.add(item); // Do this to keep general order for creative tab instead of alphabetical
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() != JustNeeded.JUSTNEEDED_TAB) {
            return;
        }

        for (ForgeWrapper<Item> item : REGISTERED_ITEMS) {
            event.accept(item.get());
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void event(LootTableLoadEvent event) {
        JustNeeded.modifyLootTables(new ForgeLootPoolModifier(event.getTable()), event.getName());
    }
}
