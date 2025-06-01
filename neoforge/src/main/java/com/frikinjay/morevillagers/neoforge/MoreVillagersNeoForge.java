package com.frikinjay.morevillagers.neoforge;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.registry.MVGifts;
import com.frikinjay.morevillagers.registry.MVProfessions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import com.frikinjay.morevillagers.platform.neoforge.CommonPlatformHelperImpl;
import com.frikinjay.morevillagers.registry.neoforge.MVConfigNeoForge;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@Mod(MoreVillagers.MOD_ID)
public final class MoreVillagersNeoForge {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreVillagers.MOD_ID);

    public static final Supplier<CreativeModeTab> MORE_VILLAGERS_TAB = CREATIVE_MODE_TABS.register("tab", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MoreVillagers.MOD_ID + ".tab"))
                    .icon(() -> new ItemStack(Items.EMERALD))
                    .displayItems((params, output) -> {
                        for (DeferredHolder<Block, ? extends Block> registeredBlock : CommonPlatformHelperImpl.BLOCKS.getEntries()) {
                            Block block = registeredBlock.get();
                            ItemStack stack = new ItemStack(block, 1);
                            if (!stack.isEmpty()) {
                                output.accept(stack);
                            }
                        }
                    })
                    .build()
    );

    public MoreVillagersNeoForge(IEventBus modEventBus, ModContainer container) {
        MoreVillagers.init();

        container.registerConfig(ModConfig.Type.COMMON, MVConfigNeoForge.COMMON_CONFIG);

        CommonPlatformHelperImpl.BLOCKS.register(modEventBus);
        CommonPlatformHelperImpl.ITEMS.register(modEventBus);
        CommonPlatformHelperImpl.POI_TYPES.register(modEventBus);
        CommonPlatformHelperImpl.PROFESSIONS.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(this::setup);

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        MoreVillagers.registerJigsaws(event.getServer());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MVProfessions.fillTradeData();
            MVGifts.registerGiftMappings();
        });
    }
}