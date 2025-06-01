package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class MVBlocks {
    public static void init() {}

    public static final Supplier<Block> OCEANOGRAPHY_TABLE = registerMVBlock("oceanography_table", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "oceanography_table"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> WOODWORKING_TABLE = registerMVBlock("woodworking_table", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "woodworking_table"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> DECAYED_WORKBENCH = registerMVBlock("decayed_workbench", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "decayed_workbench"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> PURPUR_ALTAR = registerMVBlock("purpur_altar", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "purpur_altar"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(key));
    });
    public static final Supplier<Block> BLUEPRINT_TABLE = registerMVBlock("blueprint_table", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "blueprint_table"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> GARDENING_TABLE = registerMVBlock("gardening_table", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "gardening_table"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> HUNTING_POST = registerMVBlock("hunting_post", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "hunting_post"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> MINING_BENCH = registerMVBlock("mining_bench", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "mining_bench"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(key));
    });
    public static final Supplier<Block> GILDED_STATION = registerMVBlock("gilded_station", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "gilded_station"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(key));
    });
    public static final Supplier<Block> CHILLER = registerMVBlock("chiller", () -> {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, MoreVillagers.getRL(MoreVillagers.MOD_ID, "chiller"));
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE).setId(key));
    });

    public static <T extends Block> Supplier<T> registerMVBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = CommonPlatformHelper.registerMVBlock(name, block);
        CommonPlatformHelper.registerMVItem(name,
                () -> {
                    ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, MoreVillagers.getRL(MoreVillagers.MOD_ID, name));
                    return new BlockItem(toReturn.get(), new Item.Properties().setId(key));
                });
        return toReturn;
    }
}
