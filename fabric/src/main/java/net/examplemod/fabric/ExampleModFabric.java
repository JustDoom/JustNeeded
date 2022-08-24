package net.examplemod.fabric;

import com.imjustdoom.justneeded.JustNeeded;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        JustNeeded.init();
    }
}
