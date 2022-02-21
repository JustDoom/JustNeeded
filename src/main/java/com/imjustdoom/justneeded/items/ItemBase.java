package com.imjustdoom.justneeded.items;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(JustNeeded.JustNeededTab));
    }
}
