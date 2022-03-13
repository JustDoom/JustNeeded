package com.imjustdoom.justneeded.listener;

import com.imjustdoom.justneeded.blocks.WoolSlab;
import com.imjustdoom.justneeded.blocks.WoolStairs;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "justneeded", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CropTrampleListener {

    //TODO: test

    @SubscribeEvent
    static void cropTrample(BlockEvent.FarmlandTrampleEvent event) {
        Entity entity = event.getEntity();

        if(((Player) entity).isCreative()) {
            event.setCanceled(true);
            return;
        }

        for (ItemStack itemStack : entity.getArmorSlots()) {
            if (!(itemStack.getItem() instanceof ArmorItem armorItem) || armorItem.getSlot() != EquipmentSlot.FEET) continue;

            event.setCanceled(true);
        }
    }
}