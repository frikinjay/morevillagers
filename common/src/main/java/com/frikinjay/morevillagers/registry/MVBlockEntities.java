package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.function.Supplier;

public class MVBlockEntities {

    public static void init() {
        MoreVillagers.LOGGER.info("More Villagers block entities registered: {}",
                XMAS_CHEST.toString()
        );
    }

    public static final Supplier<BlockEntityType<@NotNull XmasChestBlockEntity>> XMAS_CHEST = registerBlockEntity("xmas_chest",
            () -> new BlockEntityType<>(
                    XmasChestBlockEntity::new,
                    Set.of(MVBlocks.XMAS_CHEST.get())
            )
    );

    public static <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String name, Supplier<T> blockEntity) {
        Supplier<T> toReturn = CommonPlatformHelper.registerBlockEntity(name, blockEntity);
        MoreVillagers.LOGGER.debug("Registered block entity {}", name);
        return toReturn;
    }

}
