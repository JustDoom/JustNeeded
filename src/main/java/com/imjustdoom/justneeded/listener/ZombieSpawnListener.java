package com.imjustdoom.justneeded.listener;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ZombieSpawnListener {

    @SubscribeEvent
    public static void zombieSpawn(LivingSpawnEvent event){
        Entity mob = event.getEntity();

        if(!(mob instanceof Zombie) || mob.position().y > 50 || Math.random() > 0.5) return;

        ((Zombie) mob).setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.IRON_PICKAXE));
        ((Zombie) mob).setItemInHand(InteractionHand.OFF_HAND, new ItemStack(Items.TORCH));
    }
}