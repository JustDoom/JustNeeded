package com.imjustdoom.justneeded.init;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.blocks.GravitySlabs;
import com.imjustdoom.justneeded.blocks.GravityStairs;
import com.imjustdoom.justneeded.blocks.WoolSlab;
import com.imjustdoom.justneeded.blocks.WoolStairs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JustNeeded.MOD_ID);

    // | --------------------------- |
    // | Stairs                      |
    // | --------------------------- |
    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs",
            () -> new StairBlock(Blocks.DIRT::defaultBlockState, Block.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.5f)
            .sound(SoundType.GRAVEL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GLOWSTONE_STAIRS = registerBlock("glowstone_stairs",
            () -> new StairBlock(Blocks.GLOWSTONE::defaultBlockState, Block.Properties.of(Material.GLASS, MaterialColor.SAND)
            .strength(0.3f)
            .sound(SoundType.GLASS)
            .lightLevel(value -> 15)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> SUGAR_CANE_STAIRS = registerBlock("sugar_cane_stairs",
            () -> new StairBlock(() -> BlockInit.SUGAR_CANE_BLOCK.get().defaultBlockState(), Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)),
            JustNeeded.JustNeededTab
    );

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), Block.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)),
            JustNeeded.JustNeededTab
    );


    // | --------------------------- |
    // | Slabs                       |
    // | --------------------------- |
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(Block.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.5f, 0.5f)
            .sound(SoundType.GRAVEL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            () -> new SlabBlock(Block.Properties.of(Material.GLASS, MaterialColor.SAND)
            .strength(0.3f)
            .sound(SoundType.GLASS)
            .lightLevel(value -> 15)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> SUGAR_CANE_SLAB = registerBlock("sugar_cane_slab",
            () -> new SlabBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)),
            JustNeeded.JustNeededTab
    );

    // | --------------------------- |
    // | Gravity Affected Stairs     |
    // | --------------------------- |
    public static final RegistryObject<Block> SAND_STAIRS = registerBlock("sand_stairs",
            () -> new GravityStairs(Blocks.SAND::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.SAND)
            .strength(0.5f)
            .sound(SoundType.SAND)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> RED_SAND_STAIRS = registerBlock("red_sand_stairs",
            () -> new GravityStairs(Blocks.RED_SAND::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.SAND)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GRAVEL_STAIRS = registerBlock("gravel_stairs",
            () -> new GravityStairs(Blocks.GRAVEL::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.STONE)
            .strength(0.6f)
            .sound(SoundType.GRAVEL)),
            JustNeeded.JustNeededTab
    );


    // | --------------------------- |
    // | Gravity Affected Slabs      |
    // | --------------------------- |
    public static final RegistryObject<Block> SAND_SLAB = registerBlock("sand_slab",
            () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.SAND)
            .strength(0.5f)
            .sound(SoundType.SAND)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> RED_SAND_SLAB = registerBlock("red_sand_slab",
            () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.SAND)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GRAVEL_SLAB = registerBlock("gravel_slab",
            () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.STONE)
            .strength(0.6f)
            .sound(SoundType.GRAVEL)),
            JustNeeded.JustNeededTab
    );


    // | --------------------------- |
    // | Wool Stairs                 |
    // | --------------------------- |
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new WoolStairs(Blocks.WHITE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.SNOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new WoolStairs(Blocks.ORANGE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new WoolStairs(Blocks.MAGENTA_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new WoolStairs(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new WoolStairs(Blocks.YELLOW_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new WoolStairs(Blocks.LIME_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new WoolStairs(Blocks.PINK_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new WoolStairs(Blocks.GRAY_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new WoolStairs(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new WoolStairs(Blocks.CYAN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new WoolStairs(Blocks.PURPLE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new WoolStairs(Blocks.BLUE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new WoolStairs(Blocks.BROWN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new WoolStairs(Blocks.GREEN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new WoolStairs(Blocks.RED_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new WoolStairs(Blocks.BLACK_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );


    // | --------------------------- |
    // | Wool Slabs                  |
    // | --------------------------- |
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.SNOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(SoundType.WOOL)),
            JustNeeded.JustNeededTab
    );

    // | --------------------------- |
    // | Blocks                      |
    // | --------------------------- |
    public static final RegistryObject<Block> SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            () -> new Block(Block.Properties.of(Material.CLAY, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(SoundType.SLIME_BLOCK)),
            JustNeeded.JustNeededTab
    );
    public static final RegistryObject<Block> SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            () -> new Block(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)),
            JustNeeded.JustNeededTab
    );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}