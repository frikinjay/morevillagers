package com.frikinjay.morevillagers.neoforge.client;

import com.frikinjay.morevillagers.MoreVillagers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = MoreVillagers.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MoreVillagers.MOD_ID, value = Dist.CLIENT)
public class MoreVillagersNeoForgeClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        /*event.enqueueWork(() ->

        );*/
    }

}
