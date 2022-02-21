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
    static void handleBreakSpeed(PlayerEvent.BreakSpeed e) {
        if ((e.getState().getBlock() instanceof WoolStairs
                || e.getState().getBlock() instanceof WoolSlab)
                && e.getPlayer().getMainHandItem().is(Tags.Items.SHEARS)) {

            e.setNewSpeed(e.getOriginalSpeed() * 5.0F);
        }
    }
}
//e.getPlayer().getItemInHand(InteractionHand.MAIN_HAND).sameItem((Tag) Tags.Items.SHEARS))