package com.justdoom.justneeded.init;

import com.justdoom.justneeded.JustNeeded;
import com.justdoom.justneeded.blocks.GravitySlabs;
import com.justdoom.justneeded.blocks.GravityStairs;
import com.justdoom.justneeded.blocks.WoolSlab;
import com.justdoom.justneeded.blocks.WoolStairs;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JustNeeded.MOD_ID);

    public static void init(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Stairs
    public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs", () -> new StairBlock(Blocks.DIRT::defaultBlockState, Block.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.5f)
            //.strength(0.5f, 0.5f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GRAVEL)
    ));
    public static final RegistryObject<Block> GLOWSTONE_STAIRS = BLOCKS.register("glowstone_stairs", () -> new StairBlock(Blocks.GLOWSTONE::defaultBlockState, Block.Properties.of(Material.GLASS, MaterialColor.SAND)
            .strength(0.3f)
            .sound(SoundType.GLASS)
            .lightLevel(value -> 15)
    ));



    //Slabs
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab", () -> new SlabBlock(Block.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.5f, 0.5f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GRAVEL)
    ));
    public static final RegistryObject<Block> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () -> new SlabBlock(Block.Properties.of(Material.GLASS, MaterialColor.SAND)
            .strength(0.3f)
            .sound(SoundType.GLASS)
            .lightLevel(value -> 15)
    ));


    //Gravity Affected Stairs
    public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs", () -> new GravityStairs(Blocks.SAND::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.SAND)
            .strength(0.5f)
            ////.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> RED_SAND_STAIRS = BLOCKS.register("red_sand_stairs", () -> new GravityStairs(Blocks.RED_SAND::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs", () -> new GravityStairs(Blocks.GRAVEL::defaultBlockState, Block.Properties.of(Material.SAND, MaterialColor.STONE)
            .strength(0.6f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GRAVEL)
    ));


    //Gravity Affected Slabs
    public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab", () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.SAND)
            .strength(0.5f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> RED_SAND_SLAB = BLOCKS.register("red_sand_slab", () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab", () -> new GravitySlabs(Block.Properties.of(Material.SAND, MaterialColor.STONE)
            .strength(0.6f)
            //.harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GRAVEL)
    ));



    //Wool Stairs
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCKS.register("white_wool_stairs", () -> new WoolStairs(Blocks.WHITE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.SNOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCKS.register("orange_wool_stairs", () -> new WoolStairs(Blocks.ORANGE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCKS.register("magenta_wool_stairs", () -> new WoolStairs(Blocks.MAGENTA_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCKS.register("light_blue_wool_stairs", () -> new WoolStairs(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCKS.register("yellow_wool_stairs", () -> new WoolStairs(Blocks.YELLOW_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCKS.register("lime_wool_stairs", () -> new WoolStairs(Blocks.LIME_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCKS.register("pink_wool_stairs", () -> new WoolStairs(Blocks.PINK_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCKS.register("gray_wool_stairs", () -> new WoolStairs(Blocks.GRAY_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCKS.register("light_gray_wool_stairs", () -> new WoolStairs(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCKS.register("cyan_wool_stairs", () -> new WoolStairs(Blocks.CYAN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCKS.register("purple_wool_stairs", () -> new WoolStairs(Blocks.PURPLE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCKS.register("blue_wool_stairs", () -> new WoolStairs(Blocks.BLUE_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCKS.register("brown_wool_stairs", () -> new WoolStairs(Blocks.BROWN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCKS.register("green_wool_stairs", () -> new WoolStairs(Blocks.GREEN_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCKS.register("red_wool_stairs", () -> new WoolStairs(Blocks.RED_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCKS.register("black_wool_stairs", () -> new WoolStairs(Blocks.BLACK_WOOL::defaultBlockState, Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));



    //Wool Slabs
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = BLOCKS.register("white_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.SNOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = BLOCKS.register("orange_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = BLOCKS.register("magenta_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = BLOCKS.register("light_blue_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = BLOCKS.register("yellow_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = BLOCKS.register("lime_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = BLOCKS.register("pink_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = BLOCKS.register("gray_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = BLOCKS.register("light_gray_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = BLOCKS.register("cyan_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = BLOCKS.register("purple_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = BLOCKS.register("blue_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = BLOCKS.register("brown_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = BLOCKS.register("green_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> RED_WOOL_SLAB = BLOCKS.register("red_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = BLOCKS.register("black_wool_slab", () -> new WoolSlab(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(SoundType.WOOL)
    ));
}