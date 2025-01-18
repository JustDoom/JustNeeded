package com.imjustdoom.justneeded.platform;

import com.google.common.collect.Lists;
import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.forge.JustNeededForge;
import com.imjustdoom.justneeded.platform.services.IPlatformHelper;
import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class ForgePlatformHelper implements IPlatformHelper {
    private static final Object2IntMap<ItemLike> FUEL_ITEMS = new Object2IntLinkedOpenHashMap<>();
    private static final List<Pair<BlockColor, Supplier<? extends Block>[]>> BLOCK_COLORS = Lists.newArrayList();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JustNeeded.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JustNeeded.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), JustNeeded.MOD_ID);

    @SubscribeEvent
    public static void event(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().isEmpty()) {
            return;
        }

        int time = FUEL_ITEMS.getOrDefault(event.getItemStack().getItem(), Integer.MIN_VALUE);
        if (time != Integer.MIN_VALUE) {
            event.setBurnTime(time);
        }
    }

    @Override
    public String getPlatformName() {
        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }

    @Override
    public void registerFuel(ItemLike item, int value) {
        FUEL_ITEMS.put(item, value);
    }

    @Override
    public void registerFuel(int value, ItemLike item) {
        FUEL_ITEMS.put(item, value);
    }

    @Override
    public RegistryWrapper<Item> registerItem(String id, Supplier<Item> item) {
        ForgeWrapper<Item> wrapper = new ForgeWrapper<>(ITEMS.register(id, item));
        JustNeededForge.registerItem(wrapper);
        return wrapper;
    }

    @Override
    public <T extends Block> RegistryWrapper<T> registerBlock(String id, Supplier<T> block) {
        return new ForgeWrapper<>(BLOCKS.register(id, block));
    }

    @Override
    public void registerTab(String id, CreativeModeTab tab) {
        TABS.register(id, () -> tab);
    }

    @Override
    public void registerBlockColours(BlockColor blockColor, Supplier<? extends Block>... blocks) {
        Objects.requireNonNull(blockColor, "color is null!");
        if (Minecraft.getInstance().getBlockColors() == null) {
            BLOCK_COLORS.add(Pair.of(blockColor, blocks));
        } else {
            Minecraft.getInstance().getBlockColors().register(blockColor, unpackBlocks(blocks));
        }
    }

    @Override
    public Block[] unpackBlocks(Supplier<? extends Block>[] blocks) {
        Block[] array = new Block[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            array[i] = Objects.requireNonNull(blocks[i].get());
        }
        return array;
    }

    static {
        MinecraftForge.EVENT_BUS.register(ForgePlatformHelper.class);
    }
}