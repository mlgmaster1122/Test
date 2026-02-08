package com.decorativesticks;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class DecorativeSticksModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Set cutout render layer for stick blocks (optional: requires fabric-blockrenderlayer-v1)
		try {
			Class<?> blockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap");
			Object instance = blockRenderLayerMap.getField("INSTANCE").get(null);
			java.lang.reflect.Method putBlock = blockRenderLayerMap.getMethod("putBlock", Block.class, RenderLayer.class);
			for (Block block : ModBlocks.getBlocks()) {
				putBlock.invoke(instance, block, RenderLayer.getCutout());
			}
		} catch (Exception ignored) {
			// Fabric API blockrenderlayer not available; blocks will use default rendering
		}
	}
}
