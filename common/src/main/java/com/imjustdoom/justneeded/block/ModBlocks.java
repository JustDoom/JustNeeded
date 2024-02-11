package com.imjustdoom.justneeded.block;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.block.custom.GrassSlab;
import com.imjustdoom.justneeded.block.custom.GrassStairs;
import com.imjustdoom.justneeded.block.types.FallingSlab;
import com.imjustdoom.justneeded.block.types.FallingStairs;
import com.imjustdoom.justneeded.block.types.WoolSlab;
import com.imjustdoom.justneeded.block.types.WoolStairs;
import com.imjustdoom.justneeded.item.ModItems;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(JustNeeded.MOD_ID, Registries.BLOCK);

    // | --------------------------- |
    // | Blocks                      |
    // | --------------------------- |
    public static final RegistrySupplier<Block> SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(0.4f)
                    .sound(SoundType.SLIME_BLOCK)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .ignitedByLava()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)),
            JustNeeded.JUSTNEEDED_TAB
    );

    // | --------------------------- |
    // | Stairs                      |
    // | --------------------------- |
    public static final RegistrySupplier<Block> DIRT_STAIRS = registerBlock("dirt_stairs",
            () -> new StairBlock(Blocks.DIRT.defaultBlockState(), Block.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5f)
                    .sound(SoundType.GRAVEL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRASS_STAIRS = registerBlock("grass_stairs",
            () -> new GrassStairs(Blocks.GRASS::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .strength(0.5f)
                    .sound(SoundType.GRAVEL)
                    .randomTicks()),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GLOWSTONE_STAIRS = registerBlock("glowstone_stairs",
            () -> new StairBlock(Blocks.GLOWSTONE.defaultBlockState(), Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    // TODO: is solid blocking?
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(value -> 15)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> SUGAR_CANE_STAIRS = registerBlock("sugar_cane_stairs",
            () -> new StairBlock(ModBlocks.SUGAR_CANE_BLOCK.get().defaultBlockState(), Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .ignitedByLava()
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)),
            JustNeeded.JUSTNEEDED_TAB
    );

    public static final RegistrySupplier<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)),
            JustNeeded.JUSTNEEDED_TAB
    );


    // | --------------------------- |
    // | Slabs                       |
    // | --------------------------- |
    public static final RegistrySupplier<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(Block.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5f, 0.5f)
                    .sound(SoundType.GRAVEL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRASS_SLAB = registerBlock("grass_slab",
            () -> new GrassSlab(Block.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .strength(0.5f, 0.5f)
                    .sound(SoundType.GRAVEL)
                    .randomTicks()),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            () -> new SlabBlock(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(value -> 15)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> SUGAR_CANE_SLAB = registerBlock("sugar_cane_slab",
            () -> new SlabBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .ignitedByLava()
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)),
            JustNeeded.JUSTNEEDED_TAB
    );

    // | --------------------------- |
    // | Gravity Affected Stairs     |
    // | --------------------------- |
    public static final RegistrySupplier<Block> SAND_STAIRS = registerBlock("sand_stairs",
            () -> new FallingStairs(Blocks.SAND::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.5f)
                    .sound(SoundType.SAND)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> RED_SAND_STAIRS = registerBlock("red_sand_stairs",
            () -> new FallingStairs(Blocks.RED_SAND::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.5f)
                    .sound(SoundType.SAND)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRAVEL_STAIRS = registerBlock("gravel_stairs",
            () -> new FallingStairs(Blocks.GRAVEL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.6f)
                    .sound(SoundType.GRAVEL)),
            JustNeeded.JUSTNEEDED_TAB
    );


    // | --------------------------- |
    // | Gravity Affected Slabs      |
    // | --------------------------- |
    public static final RegistrySupplier<Block> SAND_SLAB = registerBlock("sand_slab",
            () -> new FallingSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.5f)
                    .sound(SoundType.SAND)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> RED_SAND_SLAB = registerBlock("red_sand_slab",
            () -> new FallingSlab(Block.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.5f)
                    .sound(SoundType.SAND)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRAVEL_SLAB = registerBlock("gravel_slab",
            () -> new FallingSlab(Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.6f)
                    .sound(SoundType.GRAVEL)),
            JustNeeded.JUSTNEEDED_TAB
    );


    // | --------------------------- |
    // | Wool Stairs                 |
    // | --------------------------- |
    public static final RegistrySupplier<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new WoolStairs(Blocks.WHITE_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new WoolStairs(Blocks.ORANGE_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new WoolStairs(Blocks.MAGENTA_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new WoolStairs(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new WoolStairs(Blocks.YELLOW_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new WoolStairs(Blocks.LIME_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new WoolStairs(Blocks.PINK_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new WoolStairs(Blocks.GRAY_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new WoolStairs(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new WoolStairs(Blocks.CYAN_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new WoolStairs(Blocks.PURPLE_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new WoolStairs(Blocks.BLUE_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new WoolStairs(Blocks.BROWN_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new WoolStairs(Blocks.GREEN_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new WoolStairs(Blocks.RED_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new WoolStairs(Blocks.BLACK_WOOL::defaultBlockState, Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );


    // | --------------------------- |
    // | Wool Slabs                  |
    // | --------------------------- |
    public static final RegistrySupplier<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );
    public static final RegistrySupplier<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new WoolSlab(Block.Properties.of()
                    .mapColor(MapColor.SAND)
                    .ignitedByLava()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)),
            JustNeeded.JUSTNEEDED_TAB
    );

    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block, RegistrySupplier<CreativeModeTab> tab) {
        RegistrySupplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<T> block, RegistrySupplier<CreativeModeTab> tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().arch$tab(tab)));
    }

    public static void init() {
        BLOCKS.register();
    }
}
