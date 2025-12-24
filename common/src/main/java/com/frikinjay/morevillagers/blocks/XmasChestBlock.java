package com.frikinjay.morevillagers.blocks;

import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import com.frikinjay.morevillagers.registry.MVBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class XmasChestBlock extends ChestBlock {
    public XmasChestBlock(BlockBehaviour.Properties properties) {
        super(properties, () -> MVBlockEntities.XMAS_CHEST.get());
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new XmasChestBlockEntity(pos, state);
    }
}
