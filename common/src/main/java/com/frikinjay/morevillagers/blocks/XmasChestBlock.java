package com.frikinjay.morevillagers.blocks;

import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import com.frikinjay.morevillagers.registry.MVBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class XmasChestBlock extends ChestBlock {

    public XmasChestBlock(SoundEvent soundEvent, SoundEvent soundEvent2, BlockBehaviour.Properties properties) {
        super(() -> MVBlockEntities.XMAS_CHEST.get(), soundEvent, soundEvent2, properties);
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new XmasChestBlockEntity(pos, state);
    }
}
