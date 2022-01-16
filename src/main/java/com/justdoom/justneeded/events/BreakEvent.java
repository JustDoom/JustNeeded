package com.justdoom.justneeded.events;

import com.justdoom.justneeded.blocks.WoolSlab;
import com.justdoom.justneeded.blocks.WoolStairs;
import net.minecraft.tags.Tag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "justneeded", bus = Mod.EventBusSubscriber.Bus.FORGE, value = {Dist.CLIENT})
public class BreakEvent {
    @SubscribeEvent
    static void handleBreakSpeed(PlayerEvent.BreakSpeed e) {
        if ((e.getState().getBlock() instanceof WoolStairs
                || e.getState().getBlock() instanceof WoolSlab)
                && e.getPlayer().getMainHandItem().is(Tags.Items.SHEARS))
            e.setNewSpeed(e.getOriginalSpeed() * 5.0F);
    }
}
//e.getPlayer().getItemInHand(InteractionHand.MAIN_HAND).sameItem((Tag) Tags.Items.SHEARS))