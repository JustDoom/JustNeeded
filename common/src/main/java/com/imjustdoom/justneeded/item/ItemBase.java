package com.imjustdoom.justneeded.item;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(JustNeeded.EXAMPLE_TAB));
    }
}