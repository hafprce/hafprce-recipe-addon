package com.hafprce.recipe.addon;

import com.hafprce.recipe.addon.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HafprceRecipeAddon implements ModInitializer {
	public static final String MOD_ID = "hafprcerecipeaddon";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Adding Hafprce Recipes!");
        ModItems.registerModItems();
	}
}