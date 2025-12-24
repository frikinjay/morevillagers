package com.frikinjay.morevillagers.blocks.entities;

import com.frikinjay.morevillagers.registry.MVBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class XmasChestBlockEntity extends ChestBlockEntity {

    public XmasChestBlockEntity(BlockPos pos, BlockState state) {
        super(MVBlockEntities.XMAS_CHEST.get(), pos, state);
    }

}
