package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.block.BlockInit;
import com.imjustdoom.justneeded.item.ItemInit;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class JustNeeded {
    public static final String MOD_ID = "justneeded";

    public static final CreativeTabRegistry.TabSupplier JUSTNEEDED_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "justneeded_tab"), () -> new ItemStack(ItemInit.COOKED_EGG.get()));

    public static void init() {
        BlockInit.init();
        ItemInit.init();

        FuelRegistry.register(80, Items.PAPER);
        FuelRegistry.register(255, Items.BOOK);
        FuelRegistry.register(255, Items.WRITTEN_BOOK);
        FuelRegistry.register(255, Items.WRITABLE_BOOK);
        FuelRegistry.register(80, Items.MAP);
        FuelRegistry.register(80, Items.FILLED_MAP);
        FuelRegistry.register(3745, Items.HAY_BLOCK);
        FuelRegistry.register(85, Items.ACACIA_LEAVES);
        FuelRegistry.register(85, Items.BIRCH_LEAVES);
        FuelRegistry.register(85, Items.DARK_OAK_LEAVES);
        FuelRegistry.register(85, Items.JUNGLE_LEAVES);
        FuelRegistry.register(85, Items.OAK_LEAVES);
        FuelRegistry.register(85, Items.SPRUCE_LEAVES);
        FuelRegistry.register(90, Items.GRASS);
        FuelRegistry.register(90, Items.FERN);
        FuelRegistry.register(90, Items.LARGE_FERN);
        FuelRegistry.register(90, Items.TALL_GRASS);
        FuelRegistry.register(90, Items.VINE);
    }
}
