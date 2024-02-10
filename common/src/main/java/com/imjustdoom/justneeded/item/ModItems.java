package com.imjustdoom.justneeded.item;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.item.food.CookedEgg;
import com.imjustdoom.justneeded.item.food.PumpkinSoup;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(JustNeeded.MOD_ID, Registries.ITEM);

    //Food Items
    public static final RegistrySupplier<CookedEgg> COOKED_EGG = ITEMS.register("cooked_egg", CookedEgg::new);
    public static final RegistrySupplier<PumpkinSoup> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", PumpkinSoup::new);

    // Items
    public static final RegistrySupplier<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", () -> new Item(new Item.Properties().arch$tab(JustNeeded.JUSTNEEDED_TAB)));
    public static final RegistrySupplier<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", () -> new Item(new Item.Properties().arch$tab(JustNeeded.JUSTNEEDED_TAB)));

    public static void init() {
        ITEMS.register();
    }
}