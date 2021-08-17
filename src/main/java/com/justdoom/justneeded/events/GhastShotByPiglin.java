package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class GhastShotByPiglin {

    @SubscribeEvent
    public static void paperBurn(LivingDeathEvent event){
        Entity entity = event.getEntity();
        System.out.println(entity.getName());
        if(entity instanceof Ghast){
            System.out.println(event.getSource().getDirectEntity());
            System.out.println(event.getSource().getEntity());
            if(event.getSource().getEntity() instanceof Piglin && event.getSource().getDirectEntity() instanceof Arrow){
                Level world = event.getEntity().level;
                ItemEntity item = new ItemEntity(world, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1));
                world.addFreshEntity(item);
            }
        }
    }
}