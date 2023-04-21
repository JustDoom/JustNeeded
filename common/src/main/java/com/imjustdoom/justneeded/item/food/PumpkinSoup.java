package com.imjustdoom.justneeded.item.food;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class PumpkinSoup extends Item {

    public PumpkinSoup() {
        super(new Item.Properties()
                .arch$tab(JustNeeded.JUSTNEEDED_TAB)
                .stacksTo(1)
                .food(new FoodProperties.Builder()
                        .nutrition(6)
                        .saturationMod(0.6f)
                        .build())
        );
    }

    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        super.finishUsingItem(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
}