package com.imjustdoom.justneeded;

import com.imjustdoom.justneeded.blocks.BlockInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustNeeded implements ModInitializer {
	public static final String MOD_ID = "justneeded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		BlockInit.registerBlocks();
	}
}