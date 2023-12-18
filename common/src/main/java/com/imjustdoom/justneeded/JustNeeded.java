package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.block.BlockInit;
import com.imjustdoom.justneeded.item.ItemInit;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class JustNeeded {
    public static final String MOD_ID = "justneeded";

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> JUSTNEEDED_TAB = TABS.register(
            "justneeded_tab",
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.justneeded.justneeded_tab"),
                    () -> new ItemStack(ItemInit.COOKED_EGG.get())
            )
    );

    public static void init() {
        TABS.register();

        BlockInit.init();
        ItemInit.init();

//        ModLootTableModifiers.modifyLootTables();

        FuelRegistry.register(80, Items.PAPER);
        FuelRegistry.register(255, Items.BOOK);
        FuelRegistry.register(255, Items.WRITTEN_BOOK);
        FuelRegistry.register(255, Items.WRITABLE_BOOK);
        FuelRegistry.register(80, Items.MAP);
        FuelRegistry.register(80, Items.FILLED_MAP);
        FuelRegistry.register(3745, Items.HAY_BLOCK);
        FuelRegistry.register(85, Items.ACACIA_LEAVES);
        FuelRegistry.register(85, Items.BIRCH_LEAVES);
        FuelRegistry.register(85, Items.DARK_OAK_LEAVES);
        FuelRegistry.register(85, Items.JUNGLE_LEAVES);
        FuelRegistry.register(85, Items.OAK_LEAVES);
        FuelRegistry.register(85, Items.SPRUCE_LEAVES);
        FuelRegistry.register(90, Items.GRASS);
        FuelRegistry.register(90, Items.FERN);
        FuelRegistry.register(90, Items.LARGE_FERN);
        FuelRegistry.register(90, Items.TALL_GRASS);
        FuelRegistry.register(90, Items.VINE);
    }

    // TODO: Add blocks/items to tags
}
