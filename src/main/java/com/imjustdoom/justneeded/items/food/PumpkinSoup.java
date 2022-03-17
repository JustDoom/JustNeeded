package com.imjustdoom.justneeded.items.food;

import com.imjustdoom.justneeded.items.JustNeededGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class PumpkinSoup extends Item {

    public PumpkinSoup() {
        super(new Item.Settings().group(JustNeededGroup.JUST_NEEDED)
                .maxCount(1)
                .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
    }


    // TODO: stop replacing with bowl if in creative mode
    public ItemStack finishUsing(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.finishUsing(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
}
