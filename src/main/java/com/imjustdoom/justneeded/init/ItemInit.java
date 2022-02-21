package com.imjustdoom.justneeded.init;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.blocks.BlockItemBase;
import com.imjustdoom.justneeded.items.food.CookedEgg;
import com.imjustdoom.justneeded.items.food.PumpkinSoup;
import net.minecraft.world.item.Item;
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

    //Stair items
    public static final RegistryObject<Item> DIRT_STAIRS_ITEM = ITEMS.register("dirt_stairs_item", () -> new BlockItemBase(BlockInit.DIRT_STAIRS.get()));
    public static final RegistryObject<Item> GLOWSTONE_STAIRS_ITEM = ITEMS.register("glowstone_stairs_item", () -> new BlockItemBase(BlockInit.GLOWSTONE_STAIRS.get()));


    //Gravity Affected Stairs
    public static final RegistryObject<Item> SAND_STAIRS_ITEM = ITEMS.register("sand_stairs_item", () -> new BlockItemBase(BlockInit.SAND_STAIRS.get()));
    public static final RegistryObject<Item> RED_SAND_STAIRS_ITEM = ITEMS.register("red_sand_stairs_item", () -> new BlockItemBase(BlockInit.RED_SAND_STAIRS.get()));
    public static final RegistryObject<Item> GRAVEL_STAIRS_ITEM = ITEMS.register("gravel_stairs_item", () -> new BlockItemBase(BlockInit.GRAVEL_STAIRS.get()));

    //Slab Items
    public static final RegistryObject<Item> DIRT_SLAB_ITEM = ITEMS.register("dirt_slab_item", () -> new BlockItemBase(BlockInit.DIRT_SLAB.get()));
    public static final RegistryObject<Item> GLOWSTONE_SLAB_ITEM = ITEMS.register("glowstone_slab_item", () -> new BlockItemBase(BlockInit.GLOWSTONE_SLAB.get()));

    //Gravity Affected Slabs
    public static final RegistryObject<Item> SAND_SLAB_ITEM = ITEMS.register("sand_slab_item", () -> new BlockItemBase(BlockInit.SAND_SLAB.get()));
    public static final RegistryObject<Item> RED_SAND_SLAB_ITEM = ITEMS.register("red_sand_slab_item", () -> new BlockItemBase(BlockInit.RED_SAND_SLAB.get()));
    public static final RegistryObject<Item> GRAVEL_SLAB_ITEM = ITEMS.register("gravel_slab_item", () -> new BlockItemBase(BlockInit.GRAVEL_SLAB.get()));


    //Wool Stairs
    public static final RegistryObject<Item> WHITE_WOOL_STAIRS_ITEM = ITEMS.register("white_wool_stairs_item", () -> new BlockItemBase(BlockInit.WHITE_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_WOOL_STAIRS_ITEM = ITEMS.register("orange_wool_stairs_item", () -> new BlockItemBase(BlockInit.ORANGE_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_WOOL_STAIRS_ITEM = ITEMS.register("magenta_wool_stairs_item", () -> new BlockItemBase(BlockInit.MAGENTA_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_STAIRS_ITEM = ITEMS.register("light_blue_wool_stairs_item", () -> new BlockItemBase(BlockInit.LIGHT_BLUE_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_WOOL_STAIRS_ITEM = ITEMS.register("yellow_wool_stairs_item", () -> new BlockItemBase(BlockInit.YELLOW_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> LIME_WOOL_STAIRS_ITEM = ITEMS.register("lime_wool_stairs_item", () -> new BlockItemBase(BlockInit.LIME_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> PINK_WOOL_STAIRS_ITEM = ITEMS.register("pink_wool_stairs_item", () -> new BlockItemBase(BlockInit.PINK_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_WOOL_STAIRS_ITEM = ITEMS.register("gray_wool_stairs_item", () -> new BlockItemBase(BlockInit.GRAY_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_STAIRS_ITEM = ITEMS.register("light_gray_wool_stairs_item", () -> new BlockItemBase(BlockInit.LIGHT_GRAY_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_WOOL_STAIRS_ITEM = ITEMS.register("cyan_wool_stairs_item", () -> new BlockItemBase(BlockInit.CYAN_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_WOOL_STAIRS_ITEM = ITEMS.register("purple_wool_stairs_item", () -> new BlockItemBase(BlockInit.PURPLE_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_WOOL_STAIRS_ITEM = ITEMS.register("blue_wool_stairs_item", () -> new BlockItemBase(BlockInit.BLUE_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_WOOL_STAIRS_ITEM = ITEMS.register("brown_wool_stairs_item", () -> new BlockItemBase(BlockInit.BROWN_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_WOOL_STAIRS_ITEM = ITEMS.register("green_wool_stairs_item", () -> new BlockItemBase(BlockInit.GREEN_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> RED_WOOL_STAIRS_ITEM = ITEMS.register("red_wool_stairs_item", () -> new BlockItemBase(BlockInit.RED_WOOL_STAIRS.get()));
    public static final RegistryObject<Item> BLACK_WOOL_STAIRS_ITEM = ITEMS.register("black_wool_stairs_item", () -> new BlockItemBase(BlockInit.BLACK_WOOL_STAIRS.get()));

    //Wool Slabs
    public static final RegistryObject<Item> WHITE_WOOL_SLAB_ITEM = ITEMS.register("white_wool_slab_item", () -> new BlockItemBase(BlockInit.WHITE_WOOL_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_WOOL_SLAB_ITEM = ITEMS.register("orange_wool_slab_item", () -> new BlockItemBase(BlockInit.ORANGE_WOOL_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_WOOL_SLAB_ITEM = ITEMS.register("magenta_wool_slab_item", () -> new BlockItemBase(BlockInit.MAGENTA_WOOL_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_SLAB_ITEM = ITEMS.register("light_blue_wool_slab_item", () -> new BlockItemBase(BlockInit.LIGHT_BLUE_WOOL_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_WOOL_SLAB_ITEM = ITEMS.register("yellow_wool_slab_item", () -> new BlockItemBase(BlockInit.YELLOW_WOOL_SLAB.get()));
    public static final RegistryObject<Item> LIME_WOOL_SLAB_ITEM = ITEMS.register("lime_wool_slab_item", () -> new BlockItemBase(BlockInit.LIME_WOOL_SLAB.get()));
    public static final RegistryObject<Item> PINK_WOOL_SLAB_ITEM = ITEMS.register("pink_wool_slab_item", () -> new BlockItemBase(BlockInit.PINK_WOOL_SLAB.get()));
    public static final RegistryObject<Item> GRAY_WOOL_SLAB_ITEM = ITEMS.register("gray_wool_slab_item", () -> new BlockItemBase(BlockInit.GRAY_WOOL_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_SLAB_ITEM = ITEMS.register("light_gray_wool_slab_item", () -> new BlockItemBase(BlockInit.LIGHT_GRAY_WOOL_SLAB.get()));
    public static final RegistryObject<Item> CYAN_WOOL_SLAB_ITEM = ITEMS.register("cyan_wool_slab_item", () -> new BlockItemBase(BlockInit.CYAN_WOOL_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_WOOL_SLAB_ITEM = ITEMS.register("purple_wool_slab_item", () -> new BlockItemBase(BlockInit.PURPLE_WOOL_SLAB.get()));
    public static final RegistryObject<Item> BLUE_WOOL_SLAB_ITEM = ITEMS.register("blue_wool_slab_item", () -> new BlockItemBase(BlockInit.BLUE_WOOL_SLAB.get()));
    public static final RegistryObject<Item> BROWN_WOOL_SLAB_ITEM = ITEMS.register("brown_wool_slab_item", () -> new BlockItemBase(BlockInit.BROWN_WOOL_SLAB.get()));
    public static final RegistryObject<Item> GREEN_WOOL_SLAB_ITEM = ITEMS.register("green_wool_slab_item", () -> new BlockItemBase(BlockInit.GREEN_WOOL_SLAB.get()));
    public static final RegistryObject<Item> RED_WOOL_SLAB_ITEM = ITEMS.register("red_wool_slab_item", () -> new BlockItemBase(BlockInit.RED_WOOL_SLAB.get()));
    public static final RegistryObject<Item> BLACK_WOOL_SLAB_ITEM = ITEMS.register("black_wool_slab_item", () -> new BlockItemBase(BlockInit.BLACK_WOOL_SLAB.get()));

    //Blocks
    public static final RegistryObject<Item> SPIDER_EYE_BLOCK_ITEM = ITEMS.register("spider_eye_block_item", () -> new BlockItemBase(BlockInit.SPIDER_EYE_BLOCK.get()));
}