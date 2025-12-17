package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class MVBlocks {
    public static final ResourceKey<Block> OCEANOGRAPHY_TABLE_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "oceanography_table"));
    public static final ResourceKey<Block> WOODWORKING_TABLE_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "woodworking_table"));
    public static final ResourceKey<Block> DECAYED_WORKBENCH_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "decayed_workbench"));
    public static final ResourceKey<Block> PURPUR_ALTAR_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "purpur_altar"));
    public static final ResourceKey<Block> BLUEPRINT_TABLE_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "blueprint_table"));
    public static final ResourceKey<Block> GARDENING_TABLE_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "gardening_table"));
    public static final ResourceKey<Block> HUNTING_POST_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "hunting_post"));
    public static final ResourceKey<Block> MINING_BENCH_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "mining_bench"));
    //public static final ResourceKey<Block> GILDED_STATION_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "gilded_station"));
    public static final ResourceKey<Block> CHILLER_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, "chiller"));

    public static final Supplier<Block> OCEANOGRAPHY_TABLE = registerBlock("oceanography_table", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(OCEANOGRAPHY_TABLE_KEY)));
    public static final Supplier<Block> WOODWORKING_TABLE = registerBlock("woodworking_table", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(WOODWORKING_TABLE_KEY)));
    public static final Supplier<Block> DECAYED_WORKBENCH = registerBlock("decayed_workbench", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(DECAYED_WORKBENCH_KEY)));
    public static final Supplier<Block> PURPUR_ALTAR = registerBlock("purpur_altar", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(PURPUR_ALTAR_KEY)));
    public static final Supplier<Block> BLUEPRINT_TABLE = registerBlock("blueprint_table", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(BLUEPRINT_TABLE_KEY)));
    public static final Supplier<Block> GARDENING_TABLE = registerBlock("gardening_table", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(GARDENING_TABLE_KEY)));
    public static final Supplier<Block> HUNTING_POST = registerBlock("hunting_post", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(HUNTING_POST_KEY)));
    public static final Supplier<Block> MINING_BENCH = registerBlock("mining_bench", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(MINING_BENCH_KEY)));
    //public static final Supplier<Block> GILDED_STATION = registerBlock("gilded_station", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(GILDED_STATION_KEY)));
    public static final Supplier<Block> CHILLER = registerBlock("chiller", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE).setId(CHILLER_KEY)));

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = CommonPlatformHelper.registerBlock(name, block);
        Identifier id = Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, name);
        ResourceKey<Item> resourceKeyItem = ResourceKey.create(Registries.ITEM, id);
        CommonPlatformHelper.registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties().setId(resourceKeyItem)));
        MoreVillagers.LOGGER.debug("Registered block and item {}", name);
        return toReturn;
    }

    public static void init() {

    }
}
