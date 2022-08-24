package com.imjustdoom.justneeded.item;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.item.food.CookedEgg;
import com.imjustdoom.justneeded.item.food.PumpkinSoup;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(JustNeeded.MOD_ID, Registry.ITEM_REGISTRY);
    //public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(JustNeeded.EXAMPLE_TAB)));

    //Food Items
    public static final RegistrySupplier<CookedEgg> COOKED_EGG = ITEMS.register("cooked_egg", CookedEgg::new);
    public static final RegistrySupplier<PumpkinSoup> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", PumpkinSoup::new);

    // Items
    public static final RegistrySupplier<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", ItemBase::new);
    public static final RegistrySupplier<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", ItemBase::new);

    public static void init() {
        ITEMS.register();
    }
}
