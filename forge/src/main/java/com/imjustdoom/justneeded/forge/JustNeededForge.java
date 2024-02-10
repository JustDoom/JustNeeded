package com.imjustdoom.justneeded.forge;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.ModBlocks;
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
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_BLOCK.get(), 5, 20);
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_SLAB.get(), 5, 20);
            invoker.invokeSetFlammable(ModBlocks.SUGAR_CANE_STAIRS.get(), 5, 20);

            invoker.invokeSetFlammable(ModBlocks.WHITE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.ORANGE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.MAGENTA_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.YELLOW_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIME_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PINK_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.CYAN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PURPLE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLUE_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BROWN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GREEN_WOOL_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.RED_SAND_STAIRS.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLACK_WOOL_STAIRS.get(), 30, 60);

            invoker.invokeSetFlammable(ModBlocks.WHITE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.ORANGE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.MAGENTA_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.YELLOW_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIME_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PINK_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.CYAN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.PURPLE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLUE_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BROWN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.GREEN_WOOL_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.RED_SAND_SLAB.get(), 30, 60);
            invoker.invokeSetFlammable(ModBlocks.BLACK_WOOL_SLAB.get(), 30, 60);
        });

        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(JustNeeded.MOD_ID, modBus);

        JustNeeded.init();
    }
}
