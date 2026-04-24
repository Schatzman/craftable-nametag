package com.craftable_nametag;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftableNametagMod implements ModInitializer {
	public static final String MOD_ID = "craftable_nametag";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Craftable Nametag: nametag recipe registered via data.");
	}
}
