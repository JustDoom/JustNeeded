package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class BurnTimeEvent {

    //isItemEqual
    @SubscribeEvent
    public static void paperBurn(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == Items.PAPER) {
            event.setBurnTime(80);
        } else if (event.getItemStack().getItem() == Items.BOOK) {
            event.setBurnTime(255);
        } else if (event.getItemStack().getItem() == Items.WRITTEN_BOOK) {
            event.setBurnTime(255);
        } else if (event.getItemStack().getItem() == Items.WRITABLE_BOOK) {
            event.setBurnTime(255);
        } else if (event.getItemStack().getItem() == Items.MAP) {
            event.setBurnTime(80);
        } else if (event.getItemStack().getItem() == Items.FILLED_MAP) {
            event.setBurnTime(80);
        } else if (event.getItemStack().getItem() == Items.HAY_BLOCK) {
            event.setBurnTime(3745);
        } else if (event.getItemStack().getItem() == Items.ACACIA_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.BIRCH_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.DARK_OAK_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.JUNGLE_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.OAK_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.SPRUCE_LEAVES) {
            event.setBurnTime(85);
        } else if (event.getItemStack().getItem() == Items.GRASS) {
            event.setBurnTime(90);
        } else if (event.getItemStack().getItem() == Items.FERN) {
            event.setBurnTime(90);
        } else if (event.getItemStack().getItem() == Items.LARGE_FERN) {
            event.setBurnTime(90);
        } else if (event.getItemStack().getItem() == Items.TALL_GRASS) {
            event.setBurnTime(90);
        } else if (event.getItemStack().getItem() == Items.VINE) {
            event.setBurnTime(90);
        }
    }
}