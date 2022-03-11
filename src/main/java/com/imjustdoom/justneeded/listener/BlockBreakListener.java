package com.imjustdoom.justneeded.listener;

import com.imjustdoom.justneeded.blocks.WoolSlab;
import com.imjustdoom.justneeded.blocks.WoolStairs;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "justneeded", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreakListener {
    @SubscribeEvent
    static void handleBreakSpeed(PlayerEvent.BreakSpeed event) {
        if ((event.getState().getBlock() instanceof WoolStairs
                || event.getState().getBlock() instanceof WoolSlab)
                && event.getPlayer().getMainHandItem().is(Tags.Items.SHEARS)) {

            event.setNewSpeed(event.getOriginalSpeed() * 5.0F);
        }
    }
}
//e.getPlayer().getItemInHand(InteractionHand.MAIN_HAND).sameItem((Tag) Tags.Items.SHEARS))