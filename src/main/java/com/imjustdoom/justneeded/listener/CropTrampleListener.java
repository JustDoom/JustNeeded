package com.imjustdoom.justneeded.listener;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CropTrampleListener {

    //TODO: test

    @SubscribeEvent
    static void cropTrample(BlockEvent.FarmlandTrampleEvent event) {
        Entity entity = event.getEntity();

        if(entity instanceof Player) {
            if (((Player) entity).isCreative()) {
                event.setCanceled(true);
                return;
            }
        }

        for (ItemStack itemStack : entity.getArmorSlots()) {
            if (!(itemStack.getItem() instanceof ArmorItem armorItem)
                    || armorItem.getSlot() != EquipmentSlot.FEET
                    || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FALL_PROTECTION, itemStack) == 0) continue;

            event.setCanceled(true);
        }
    }
}