package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ZombieSpawnEvent {

    /**@SubscribeEvent
    public static void zombieSpawn(LivingSpawnEvent.SpecialSpawn event){
        Entity mob = event.getEntity();

        if (mob instanceof ZombieEntity){
            if(mob.getPosY() <= 50){
                ((ZombieEntity) mob).setHeldItem(new ItemStack(Items.STEA));
            }
        }
    }**/
}
