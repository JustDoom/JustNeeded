package com.imjustdoom.justneeded.listener;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RemapListener {

    @SubscribeEvent
    public static void missingItemMappings(RegistryEvent.MissingMappings<Item> event) {
        for (RegistryEvent.MissingMappings.Mapping<Item> entry : event.getAllMappings()) {
            System.out.println(entry.key.toString());
            if (entry.key.toString().equals(JustNeeded.MOD_ID + ":dirt_stairs_item"))  {
                entry.remap(ItemInit.DIRT_STAIRS_ITEM.get());
            }
        }
    }
}