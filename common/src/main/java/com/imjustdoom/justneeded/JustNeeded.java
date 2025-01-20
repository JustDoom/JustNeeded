package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.block.ModBlocks;
import com.imjustdoom.justneeded.platform.LootPoolModifier;
import com.imjustdoom.justneeded.platform.Services;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.function.Supplier;

public class JustNeeded {
    public static final String MOD_ID = "justneeded";
    public static final String MOD_NAME = "Just Needed";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static CreativeModeTab JUSTNEEDED_TAB;

    public static final ResourceLocation JUNGLE_TEMPLE_DISPENSER = new ResourceLocation("minecraft", "chests/jungle_temple_dispenser");

    public static void init(CreativeModeTab tab) {
        JUSTNEEDED_TAB = tab;

        registerFuel();
    }

    public static void clientInit() {
        registerBlockColours((blockState, blockAndTintGetter, blockPos, i) -> {
            if (blockAndTintGetter == null || blockPos == null) {
                return GrassColor.getDefaultColor();
            }
            return BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos);
        }, ModBlocks.GRASS_SLAB.get(), ModBlocks.GRASS_STAIRS.get());
    }

    private static void registerBlockColours(BlockColor color, Block... blocks) {
        Supplier<Block>[] array = new Supplier[blocks.length];
        for (var i = 0; i < blocks.length; i++) {
            var block = Objects.requireNonNull(blocks[i], "blocks[i] is null!");
            array[i] = () -> block;
        }
        Services.PLATFORM.registerBlockColours(color, array);
    }

    public static void modifyLootTables(LootPoolModifier lootTable, ResourceLocation resourceLocation) {
        if (JUNGLE_TEMPLE_DISPENSER.equals(resourceLocation)) {
            LootPool.Builder builder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1))
                    .add(LootItem.lootTableItem(Items.TIPPED_ARROW))
                    .apply(SetPotionFunction.setPotion(Potions.POISON))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 4)));

            lootTable.addPool(builder.build());
        }
    }

    public static void registerFuel() {
        Services.PLATFORM.registerFuel(80, Items.PAPER);
        Services.PLATFORM.registerFuel(255, Items.BOOK);
        Services.PLATFORM.registerFuel(255, Items.WRITTEN_BOOK);
        Services.PLATFORM.registerFuel(255, Items.WRITABLE_BOOK);
        Services.PLATFORM.registerFuel(80, Items.MAP);
        Services.PLATFORM.registerFuel(80, Items.FILLED_MAP);
        Services.PLATFORM.registerFuel(3745, Items.HAY_BLOCK);
        Services.PLATFORM.registerFuel(85, Items.ACACIA_LEAVES);
        Services.PLATFORM.registerFuel(85, Items.BIRCH_LEAVES);
        Services.PLATFORM.registerFuel(85, Items.DARK_OAK_LEAVES);
        Services.PLATFORM.registerFuel(85, Items.JUNGLE_LEAVES);
        Services.PLATFORM.registerFuel(85, Items.OAK_LEAVES);
        Services.PLATFORM.registerFuel(85, Items.SPRUCE_LEAVES);
        Services.PLATFORM.registerFuel(90, Items.GRASS);
        Services.PLATFORM.registerFuel(90, Items.FERN);
        Services.PLATFORM.registerFuel(90, Items.LARGE_FERN);
        Services.PLATFORM.registerFuel(90, Items.TALL_GRASS);
        Services.PLATFORM.registerFuel(90, Items.VINE);
    }

    // TODO: Add blocks/items to tags
    // TODO: Custom music
}
