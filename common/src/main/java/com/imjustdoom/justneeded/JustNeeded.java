package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.block.ModBlocks;
import com.imjustdoom.justneeded.item.ModItems;
import dev.architectury.event.events.common.LightningEvent;
import dev.architectury.event.events.common.LootEvent;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class JustNeeded {
    public static final String MOD_ID = "justneeded";

    public static final ResourceLocation JUNGLE_TEMPLE_DISPENSER = new ResourceLocation("minecraft", "chests/jungle_temple_dispenser");

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> JUSTNEEDED_TAB = TABS.register(
            "justneeded_tab",
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.justneeded.justneeded_tab"),
                    () -> new ItemStack(ModItems.COOKED_EGG.get())
            )
    );

    public static void init() {
        TABS.register();

        ModBlocks.init();
        ModItems.init();

        ColorHandlerRegistry.registerBlockColors((blockState, blockAndTintGetter, blockPos, i) -> {
            if (blockAndTintGetter == null || blockPos == null) {
                return GrassColor.getDefaultColor();
            }
            return BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos);
        }, ModBlocks.GRASS_SLAB, ModBlocks.GRASS_STAIRS);

        modifyLootTables();

        registerFuel();

        LightningEvent.STRIKE.register((LightningBolt bolt, Level level, Vec3 pos, List<Entity> toStrike) -> {
            BlockPos blockPos = new BlockPos((int) pos.x, (int) pos.y - 1, (int) pos.z);
            if (level.getBlockState(blockPos).getBlock() == Blocks.SAND) {
                level.setBlock(blockPos, Blocks.GLASS.defaultBlockState(), 3);
            } else if (level.getBlockState(blockPos).getBlock() == Blocks.RED_SAND) {
                level.setBlock(blockPos, Blocks.RED_STAINED_GLASS.defaultBlockState(), 3);
            }
        });

//        EntityEvent.ADD.register((Entity entity, Level world) -> {
//            if (entity.position().y > 50) {
//                return EventResult.pass();
//            }
//
//            entity.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_PICKAXE));
//
//            return EventResult.pass();
//        });
    }

    public static void modifyLootTables() {
        LootEvent.MODIFY_LOOT_TABLE.register((dataManager, resourceLocation, context, builtIn) -> {
            if (JUNGLE_TEMPLE_DISPENSER.equals(resourceLocation)) {

                LootPool.Builder builder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1))
                        .add(LootItem.lootTableItem(Items.TIPPED_ARROW))
                        .apply(SetPotionFunction.setPotion(Potions.POISON))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 4)));

                context.addPool(builder.build());
            }
        });
    }

    public static void registerFuel() {
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

    // TODO: Add blocks/items to tags
    // TODO: Custom music
}
