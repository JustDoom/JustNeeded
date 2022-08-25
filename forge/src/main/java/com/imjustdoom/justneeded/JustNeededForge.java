package com.imjustdoom.forge;

import dev.architectury.platform.forge.EventBuses;
import com.imjustdoom.justneeded.JustNeeded;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JustNeeded.MOD_ID)
public class JustNeededForge {
    public JustNeededForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(JustNeeded.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        JustNeeded.init();
    }
}
