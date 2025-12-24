package com.frikinjay.morevillagers.mixin;

import com.frikinjay.morevillagers.blocks.entities.XmasChestBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChestRenderer.class)
public abstract class ChestRendererMixin {

    @Shadow private boolean xmasTextures;

    @Inject(
            method = "render(Lnet/minecraft/world/level/block/entity/BlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II)V",
            at = @At("HEAD")
    )
    private void onRender(BlockEntity blockEntity, float f, PoseStack poseStack, MultiBufferSource buffer, int i, int j, CallbackInfo ci) {
        if (blockEntity instanceof XmasChestBlockEntity) {
            this.xmasTextures = true;
        }
    }

}