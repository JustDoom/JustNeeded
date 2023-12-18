package com.imjustdoom.justneeded.forge;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.BlockInit;
import com.imjustdoom.justneeded.forge.mixin.FireBlockInvoker;
import dev.architectury.platform.forge.EventBuses;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JustNeeded.MOD_ID)
public class JustNeededForge {
    public JustNeededForge() {

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener((FMLCommonSetupEvent e) -> {

            FireBlockInvoker invoker = ((FireBlockInvoker) Blocks.FIRE);
            invoker.invokeSetFlammable(BlockInit.SUGAR_CANE_BLOCK.get(), 5, 20);
            invoker.invokeSetFlammable(BlockInit.SUGAR_CANE_SLAB.get(), 5, 20);
            invoker.invokeSetFlammable(BlockInit.SUGAR_CANE_STAIRS.get(), 5, 20);

            invoker.invokeSetFlammable(BlockInit.WHITE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.ORANGE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.MAGENTA_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIGHT_BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.YELLOW_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIME_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.PINK_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIGHT_GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.CYAN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.PURPLE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BROWN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.GREEN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.RED_SAND_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BLACK_WOOL_STAIRS.get(), 30, 60);

            invoker.invokeSetFlammable(BlockInit.WHITE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.ORANGE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.MAGENTA_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIGHT_BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.YELLOW_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIME_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.PINK_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.LIGHT_GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.CYAN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.PURPLE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BROWN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.GREEN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.RED_SAND_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(BlockInit.BLACK_WOOL_SLAB.get(), 30, 60);
        });

        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(JustNeeded.MOD_ID, modBus);

        JustNeeded.init();
    }
}
