package com.frikinjay.morevillagers.fabric.client;

import com.frikinjay.morevillagers.registry.MVBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.ChestRenderer;

public final class MoreVillagersFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(MVBlockEntities.XMAS_CHEST.get(), ChestRenderer::new);
    }
}
