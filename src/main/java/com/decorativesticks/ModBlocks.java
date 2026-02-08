package com.decorativesticks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    private static final List<Block> ALL_BLOCKS = new ArrayList<>();
    
    // Material colors (32 variants)
    private static final String[] COLORS = {
        "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
        "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };
    
    private static final String[] MATERIALS = {"concrete", "terracotta"};
    
    
    public enum StickType {
        VERTICAL_CENTER("vertical_centered", createBox(6, 0, 6, 4, 16, 4)),
        VERTICAL_LEFT("vertical_left", createBox(0, 0, 6, 4, 16, 4)),
        VERTICAL_RIGHT("vertical_right", createBox(12, 0, 6, 4, 16, 4)),
        VERTICAL_MIDDLE("vertical_middle", createBox(6, 0, 0, 4, 16, 4)),
        HORIZONTAL_TOP("horizontal_top", createBox(6, 12, 0, 4, 4, 16)),
        HORIZONTAL_MIDDLE("horizontal_middle", createBox(6, 6, 0, 4, 4, 16)),
        HORIZONTAL_BOTTOM("horizontal_bottom", createBox(6, 0, 0, 4, 4, 16)),
        CROSS_LARGE("cross_large", createCrossShape());
        
        private final String name;
        private final VoxelShape shape;
        
        StickType(String name, VoxelShape shape) {
            this.name = name;
            this.shape = shape;
        }
        
        public String getName() {
            return name;
        }
        
        public VoxelShape getShape() {
            return shape;
        }
    }
    
    private static VoxelShape createBox(double x, double y, double z, double width, double height, double depth) {
        return Block.createCuboidShape(x, y, z, x + width, y + height, z + depth);
    }
    
    private static VoxelShape createCrossShape() {
        VoxelShape vertical = createBox(6, 0, 6, 4, 16, 4);
        VoxelShape horizontal = createBox(6, 6, 0, 4, 4, 16);
        return VoxelShapes.union(vertical, horizontal);
    }
    
    public static void registerBlocks() {
    
        for (String material : MATERIALS) {
            for (String color : COLORS) {
                for (StickType type : StickType.values()) {
                    registerStickBlock(material, color, type);
                }
            }
        }
        
        DecorativeSticksMod.LOGGER.info("Registered {} decorative stick blocks", ALL_BLOCKS.size());
    }
    
    private static void registerStickBlock(String material, String color, StickType type) {
        String blockName = String.format("stick_%s_%s_%s", type.getName(), material, color);
        
        Identifier id = Identifier.of(DecorativeSticksMod.MOD_ID, blockName);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
    
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(Blocks.STONE)
            .strength(2.0f, 6.0f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .registryKey(blockKey);  

        DirectionalStickBlock block = new DirectionalStickBlock(settings, type.getShape());
        Registry.register(Registries.BLOCK, id, block);
        
        Item.Settings itemSettings = new Item.Settings()
            .registryKey(itemKey)
            .useBlockPrefixedTranslationKey();

        BlockItem blockItem = new BlockItem(block, itemSettings); 
        Registry.register(Registries.ITEM, id, blockItem);
        
        ALL_BLOCKS.add(block);
    }
    
    public static void addToCreativeTab(FabricItemGroupEntries entries) {
        for (Block block : ALL_BLOCKS) {
            entries.add(block);
        }
    }
    
    public static void setRenderLayers() {
       
        for (Block block : ALL_BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
    }
}
