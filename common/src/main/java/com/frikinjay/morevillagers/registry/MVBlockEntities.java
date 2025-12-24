package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class MVBlockEntities {

    public static void init() {
        MoreVillagers.LOGGER.info("More Villagers block entities registered: {}",
                XMAS_CHEST.toString()
        );
    }

    public static final Supplier<BlockEntityType<XmasChestBlockEntity>> XMAS_CHEST = registerBlockEntity("xmas_chest", () ->
            BlockEntityType.Builder.of(XmasChestBlockEntity::new,
                    MVBlocks.XMAS_CHEST.get()).build(null));

    public static <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String name, Supplier<T> blockEntity) {
        Supplier<T> toReturn = CommonPlatformHelper.registerBlockEntity(name, blockEntity);
        MoreVillagers.LOGGER.debug("Registered block entity {}", name);
        return toReturn;
    }

}
