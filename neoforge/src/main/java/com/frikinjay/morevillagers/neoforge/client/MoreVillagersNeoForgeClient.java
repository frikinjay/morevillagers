package com.frikinjay.morevillagers.neoforge.client;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.registry.MVBlockEntities;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(value = MoreVillagers.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MoreVillagers.MOD_ID, value = Dist.CLIENT)
public class MoreVillagersNeoForgeClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        /*event.enqueueWork(() ->

        );*/
    }

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(MVBlockEntities.XMAS_CHEST.get(), ChestRenderer::new);
    }

}
