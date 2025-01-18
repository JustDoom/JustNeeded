package com.imjustdoom.justneeded.item;

import com.imjustdoom.justneeded.platform.RegistryWrapper;
import com.imjustdoom.justneeded.platform.Services;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {

    //Food Items
    public static final RegistryWrapper<Item> COOKED_EGG = register("cooked_egg", () -> new CustomItem(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(5)
                    .build())));
    public static final RegistryWrapper<Item> PUMPKIN_SOUP = register("pumpkin_soup", () -> new BowlFoodItem(new Item.Properties()
            .stacksTo(1)
            .food(new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .build())));

    // Items
    public static final RegistryWrapper<Item> STICK_BUNDLE = register("stick_bundle", () -> new Item(new Item.Properties()));
    public static final RegistryWrapper<Item> BLAZE_ROD_BUNDLE = register("blaze_rod_bundle", () -> new Item(new Item.Properties()));

    public static RegistryWrapper<Item> register(String id, Supplier<Item> item) {
        return Services.PLATFORM.registerItem(id, item);
    }

    public static void init() {}
}