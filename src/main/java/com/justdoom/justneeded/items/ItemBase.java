package com.justdoom.justneeded.items;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(JustNeeded.JustNeededTab));
    }
}
