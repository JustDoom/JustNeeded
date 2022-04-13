package com.imjustdoom.justneeded.init;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.blocks.BlockItemBase;
import com.imjustdoom.justneeded.items.ItemBase;
import com.imjustdoom.justneeded.items.food.CookedEgg;
import com.imjustdoom.justneeded.items.food.PumpkinSoup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JustNeeded.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Food Items
    public static final RegistryObject<CookedEgg> COOKED_EGG = ITEMS.register("cooked_egg", CookedEgg::new);
    public static final RegistryObject<PumpkinSoup> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", PumpkinSoup::new);

    // Items
    public static final RegistryObject<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", ItemBase::new);
    public static final RegistryObject<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", ItemBase::new);
}