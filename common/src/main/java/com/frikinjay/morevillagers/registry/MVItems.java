package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class MVItems {

    public static void init() {
        //MoreVillagers.LOGGER.info("More Villagers blocks registered: {}",
        //        OCEANOGRAPHY_TABLE.toString()
        //);
    }

    //public static final Supplier<Block> OCEANOGRAPHY_TABLE = registerItem("oceanography_table", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)));

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = CommonPlatformHelper.registerItem(name, item);
        MoreVillagers.LOGGER.debug("Registered item {}", name);
        return toReturn;
    }

}
