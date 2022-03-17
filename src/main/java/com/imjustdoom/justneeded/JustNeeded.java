package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.blocks.BlockInit;
import com.imjustdoom.justneeded.items.ItemInit;
import com.imjustdoom.justneeded.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustNeeded implements ModInitializer {
	public static final String MOD_ID = "justneeded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing JustNeeded");
		BlockInit.registerBlocks();
		ItemInit.registerItems();

		ModRegistries.registerModStuffs();
	}
}