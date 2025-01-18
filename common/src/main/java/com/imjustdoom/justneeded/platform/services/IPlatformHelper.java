package com.imjustdoom.justneeded.platform.services;

import com.imjustdoom.justneeded.platform.RegistryWrapper;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;

import java.util.function.Supplier;

public interface IPlatformHelper {

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    void registerFuel(ItemLike item, int value);
    void registerFuel(int value, ItemLike item);

    RegistryWrapper<Item> registerItem(String id, Supplier<Item> item);
    <T extends Block> RegistryWrapper<T> registerBlock(String id, Supplier<T> block);
    void registerTab(String id, CreativeModeTab tab);

    void registerBlockColours(BlockColor blockColor, Supplier<? extends Block>... blocks);
    Block[] unpackBlocks(Supplier<? extends Block>[] blocks);
}