package com.imjustdoom.justneeded;

import com.google.common.base.Suppliers;
import com.imjustdoom.justneeded.block.BlockInit;
import com.imjustdoom.justneeded.item.ItemInit;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class JustNeeded {
    public static final String MOD_ID = "justneeded";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));

    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "justneeded_tab"), () -> new ItemStack(ItemInit.COOKED_EGG.get()));

    public static void init() {
        BlockInit.init();
        ItemInit.init();
    }
}
