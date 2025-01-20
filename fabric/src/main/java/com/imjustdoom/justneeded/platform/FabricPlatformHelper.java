package com.imjustdoom.justneeded.platform;

import com.imjustdoom.justneeded.JustNeeded;
import com.imjustdoom.justneeded.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.Objects;
import java.util.function.Supplier;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public void registerFuel(int value, ItemLike item) {
        FuelRegistry.INSTANCE.add(item, value);
    }

    @Override
    public RegistryWrapper<Item> registerItem(String id, Supplier<Item> item) {
        return new FabricWrapper<>(Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(JustNeeded.MOD_ID, id), item.get()));
    }

    @Override
    public <T extends Block> RegistryWrapper<T> registerBlock(String id, Supplier<T> block) {
        return new FabricWrapper<>(Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(JustNeeded.MOD_ID, id), block.get()));
    }

    @Override
    public void registerTab(String id, CreativeModeTab tab) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(JustNeeded.MOD_ID, id), tab);
    }

    @Override
    public void registerBlockColours(BlockColor blockColor, Supplier<? extends Block>... blocks) {
        Objects.requireNonNull(blockColor, "color is null!");
        ColorProviderRegistry.BLOCK.register(blockColor, unpackBlocks(blocks));
    }

    @Override
    public Block[] unpackBlocks(Supplier<? extends Block>[] blocks) {
        Block[] array = new Block[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            array[i] = Objects.requireNonNull(blocks[i].get());
        }
        return array;
    }
}
