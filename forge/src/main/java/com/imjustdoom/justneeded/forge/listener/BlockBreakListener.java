package com.imjustdoom.justneeded.forge.listener;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.custom.WoolSlab;
import com.imjustdoom.justneeded.block.custom.WoolStairs;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreakListener {
    @SubscribeEvent
    static void handleBreakSpeed(PlayerEvent.BreakSpeed event) {
        if ((event.getState().getBlock() instanceof WoolStairs
                || event.getState().getBlock() instanceof WoolSlab)
                && event.getEntity().getMainHandItem().is(Tags.Items.SHEARS)) {

            event.setNewSpeed(event.getOriginalSpeed() * 5.0F);
        }
    }
}