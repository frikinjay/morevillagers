package com.frikinjay.morevillagers.fabric;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.registry.MVGifts;
import com.frikinjay.morevillagers.registry.MVProfessions;
import com.frikinjay.morevillagers.registry.fabric.MVConfigFabric;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.frikinjay.morevillagers.platform.fabric.CommonPlatformHelperImpl.REGISTERED_BLOCKS;

public final class MoreVillagersFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        AutoConfig.register(MVConfigFabric.class, GsonConfigSerializer::new);
        MoreVillagers.init();
        MVProfessions.fillTradeData();
        MVGifts.registerGiftMappings();
        ServerLifecycleEvents.SERVER_STARTING.register(MoreVillagers::registerJigsaws);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MoreVillagers.TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.EMERALD))
                .title(Component.translatable("itemGroup." + MoreVillagers.MOD_ID + ".tab"))
                .displayItems((context, entries) ->
                {
                    for (Supplier<Block> registeredBlock : REGISTERED_BLOCKS) {
                        Block block = registeredBlock.get();
                        if (block != null) {
                            entries.accept(new ItemStack(block));
                        }
                    }
                })
                .build());
    }
}
