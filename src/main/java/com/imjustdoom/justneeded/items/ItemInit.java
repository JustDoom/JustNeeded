package com.imjustdoom.justneeded.items;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.items.JustNeededGroup;
import com.imjustdoom.justneeded.items.food.PumpkinSoup;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static Item STICK_BUNDLE = registerItem("stick_bundle", new Item(new Item.Settings().group(JustNeededGroup.JUST_NEEDED)));
    public static Item BLAZE_ROD_BUNDLE = registerItem("blaze_rod_bundle", new Item(new Item.Settings().group(JustNeededGroup.JUST_NEEDED)));

    // Food
    public static Item COOKED_EGG = registerItem("cooked_egg", new Item(
            new Item.Settings().group(JustNeededGroup.JUST_NEEDED)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static Item PUMPKIN_SOUP = registerItem("pumpkin_soup", new PumpkinSoup());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustNeeded.MOD_ID, name), item);
    }

    public static void registerItems() {

    }
}
