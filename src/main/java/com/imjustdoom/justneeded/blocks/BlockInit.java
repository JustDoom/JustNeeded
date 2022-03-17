package com.imjustdoom.justneeded.blocks;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.blocks.custom.*;
import com.imjustdoom.justneeded.blocks.custom.ModSlabBlock;
import com.imjustdoom.justneeded.items.JustNeededGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {

    // Blocks
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.SLIME).strength(0.4f)), JustNeededGroup.JUST_NEEDED);
    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f)), JustNeededGroup.JUST_NEEDED);

    // Stairs
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs",
            new ModStairsBlock(Blocks.DIRT.getDefaultState(),
                    FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).strength(0.5f)), JustNeededGroup.JUST_NEEDED);
    public static final Block SAND_STAIRS = registerBlock("sand_stairs",
            new ModGravityStairsBlock(Blocks.SAND.getDefaultState(),
                    FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.SAND).strength(0.5f)), JustNeededGroup.JUST_NEEDED);
    public static final Block RED_SAND_STAIRS = registerBlock("red_sand_stairs",
            new ModGravityStairsBlock(Blocks.SAND.getDefaultState(),
                    FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.SAND).strength(0.5f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GRAVEL_STAIRS = registerBlock("gravel_stairs",
            new ModGravityStairsBlock(Blocks.SAND.getDefaultState(),
                    FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).strength(0.5f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GLOWSTONE_STAIRS = registerBlock("glowstone_stairs",
            new ModStairsBlock(Blocks.GLOWSTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).strength(0.3f).lightLevel(15)), JustNeededGroup.JUST_NEEDED);
    public static final Block SUGAR_CANE_STAIRS = registerBlock("sugar_cane_stairs",
            new ModStairsBlock(BlockInit.SUGAR_CANE_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f)), JustNeededGroup.JUST_NEEDED);

    // Wool stairs
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new ModStairsBlock(Blocks.WHITE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new ModStairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new ModStairsBlock(Blocks.WHITE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new ModStairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new ModStairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new ModStairsBlock(Blocks.LIME_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new ModStairsBlock(Blocks.PINK_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new ModStairsBlock(Blocks.GRAY_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new ModStairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new ModStairsBlock(Blocks.CYAN_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new ModStairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new ModStairsBlock(Blocks.BLUE_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new ModStairsBlock(Blocks.BROWN_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new ModStairsBlock(Blocks.GREEN_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new ModStairsBlock(Blocks.RED_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new ModStairsBlock(Blocks.BLACK_WOOL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);

    // Slab
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).strength(0.5f)),
            JustNeededGroup.JUST_NEEDED);
    public static final Block SAND_SLAB = registerBlock("sand_slab",
            new ModGravitySlabBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.SAND).strength(0.5f)),
            JustNeededGroup.JUST_NEEDED);
    public static final Block RED_SAND_SLAB = registerBlock("red_sand_slab",
            new ModGravitySlabBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.SAND).strength(0.5f)),
            JustNeededGroup.JUST_NEEDED);
    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab",
            new ModGravitySlabBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).strength(0.5f)),
            JustNeededGroup.JUST_NEEDED);
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).strength(0.3f).lightLevel(15)),
            JustNeededGroup.JUST_NEEDED);
    public static final Block SUGAR_CANE_SLAB = registerBlock("sugar_cane_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f)),
            JustNeededGroup.JUST_NEEDED);

    // Wool slabs
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new ModSlabBlock(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f)), JustNeededGroup.JUST_NEEDED);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(JustNeeded.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(JustNeeded.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBlocks() {

    }
}
