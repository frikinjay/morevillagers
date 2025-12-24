package com.frikinjay.morevillagers.mixin;

import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.renderer.blockentity.state.ChestRenderState.ChestMaterialType;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChestRenderer.class)
public class ChestRendererMixin {

    @Inject(
            method = "getChestMaterial(Lnet/minecraft/world/level/block/entity/BlockEntity;Z)Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState$ChestMaterialType;",
            at = @At("HEAD"),
            cancellable = true
    )
    private void forceXmasTexture(BlockEntity blockEntity, boolean bl, CallbackInfoReturnable<ChestMaterialType> cir) {
        if (blockEntity instanceof XmasChestBlockEntity) {
            cir.setReturnValue(ChestMaterialType.CHRISTMAS);
        }
    }
}