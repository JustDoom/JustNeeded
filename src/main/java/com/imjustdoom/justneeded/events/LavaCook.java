package com.imjustdoom.justneeded.events;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class LavaCook {

    /**private OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
    Random random = new Random();

    @SubscribeEvent
    public void burnableItem(ItemTossEvent event) {
        ItemEntity tossed = event.getEntityItem();
        Optional<FurnaceRecipe> canBeSmelted = tossed.world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory(tossed.getItem()), tossed.world);
        if(!canBeSmelted.isPresent()) return;
        World world = tossed.world;
        ItemEntity smelted = new ItemEntity(world, tossed.getPosX(), tossed.getPosY(), tossed.getPosZ(), canBeSmelted.get().getRecipeOutput());
        smelted.getItem().setCount(tossed.getItem().getCount());
        AtomicBoolean hasBeenBurned = new AtomicBoolean(false);
        Thread cancelBurning = new Thread(() -> {
            while(true) {
                if(!hasBeenBurned.get()) {
                    if(tossed.isInLava() || tossed.isBurning()) {
                        smelted.setPosition(tossed.getPosX(), tossed.getPosY(), tossed.getPosZ());
                        world.addEntity(smelted);
                        hasBeenBurned.set(true);
                    }
                }
                if(hasBeenBurned.get()) {
                    if(smelted.isInLava() || smelted.isBurning()) {
                        smelted.extinguish();
                        smelted.setInvulnerable(true);
                        smelted.setMotion(random.nextGaussian() / 8, .15, random.nextGaussian() / 8);
                    }
                    smelted.setInvulnerable(false);
                }
            }
        });
        cancelBurning.setName(smelted.getUniqueID().toString()+"_lavasmelting");
        cancelBurning.start();
    }

    @SubscribeEvent
    public void pickupBurnedItem(PlayerEvent.ItemPickupEvent event) {
        Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();
        allThreads.forEach((x,e) -> {
            if(x.getName().equals(event.getOriginalEntity().getUniqueID().toString()+"_lavasmelting")) {
                x.stop();
            }
        });
    }

    @SubscribeEvent
    public void burnedItemDespawn(ItemExpireEvent event) {
        Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();
        allThreads.forEach((x,e) -> {
            if(x.getName().equals(event.getEntityItem().getUniqueID().toString()+"_lavasmelting")) {
                x.stop();
            }
        });
    }

    private void surrenderItem() {
        Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();
        allThreads.forEach((x,e) -> {
            if(x.getName().contains("_lavasmelting")) {
                x.stop();
            }
        });
    }**/
}
