package com.imjustdoom.justneeded.fabric;

import com.imjustdoom.justneeded.JustNeeded;
import net.fabricmc.api.ClientModInitializer;

public class JustNeededClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        JustNeeded.clientInit();
    }
}
