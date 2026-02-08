package com.decorativesticks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecorativeSticksMod implements ModInitializer {
	public static final String MOD_ID = "decorativesticks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Decorative Sticks Mod");
		
		// Register blocks
		ModBlocks.registerBlocks();
		
		// Add items to creative tab
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			ModBlocks.addToCreativeTab(content);
		});
		
		LOGGER.info("Decorative Sticks Mod initialized successfully!");
	}
}
