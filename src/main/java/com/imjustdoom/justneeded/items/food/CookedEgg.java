package com.imjustdoom.justneeded.items.food;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedEgg extends Item {

    public CookedEgg() {
        super(new Item.Properties()
                .tab(JustNeeded.JustNeededTab)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(5)
                        .build())
        );
    }
}
