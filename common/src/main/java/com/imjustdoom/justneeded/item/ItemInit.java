package com.imjustdoom.justneeded.item;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.item.food.CookedEgg;
import com.imjustdoom.justneeded.item.food.PumpkinSoup;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(JustNeeded.MOD_ID, Registry.ITEM_REGISTRY);

    //Food Items
    public static final RegistrySupplier<CookedEgg> COOKED_EGG = ITEMS.register("cooked_egg", CookedEgg::new);
    public static final RegistrySupplier<PumpkinSoup> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", PumpkinSoup::new);

    // Items
    public static final RegistrySupplier<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", ItemBase::new);
    public static final RegistrySupplier<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", ItemBase::new);

    //Armour
    public static final RegistrySupplier<Item> GOLD_CHAIN_HELMET = ITEMS.register("gold_chainmail_helmet", () -> new ArmorItem(ModArmourMaterials.GOLD_CHAIN, EquipmentSlot.HEAD, new Item.Properties().tab(JustNeeded.JUSTNEEDED_TAB)));
    public static final RegistrySupplier<Item> GOLD_CHAIN_CHESTPLATE = ITEMS.register("gold_chainmail_chestplate", () -> new ArmorItem(ModArmourMaterials.GOLD_CHAIN, EquipmentSlot.CHEST, new Item.Properties().tab(JustNeeded.JUSTNEEDED_TAB)));
    public static final RegistrySupplier<Item> GOLD_CHAIN_LEGGINGS = ITEMS.register("gold_chainmail_leggings", () -> new ArmorItem(ModArmourMaterials.GOLD_CHAIN, EquipmentSlot.LEGS, new Item.Properties().tab(JustNeeded.JUSTNEEDED_TAB)));
    public static final RegistrySupplier<Item> GOLD_CHAIN_BOOTS = ITEMS.register("gold_chainmail_boots", () -> new ArmorItem(ModArmourMaterials.GOLD_CHAIN, EquipmentSlot.FEET, new Item.Properties().tab(JustNeeded.JUSTNEEDED_TAB)));

    public static void init() {
        ITEMS.register();
    }
}