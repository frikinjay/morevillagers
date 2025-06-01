package com.frikinjay.morevillagers.platform.neoforge;

import com.frikinjay.morevillagers.MoreVillagers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;
import java.util.function.Supplier;

public class CommonPlatformHelperImpl {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreVillagers.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreVillagers.MOD_ID);
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(Registries.VILLAGER_PROFESSION, MoreVillagers.MOD_ID);
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, MoreVillagers.MOD_ID);

    public static <T extends Block> Supplier<T> registerMVBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Item> Supplier<T> registerMVItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static Supplier<VillagerProfession> registerMVProfession(String name, Supplier<VillagerProfession> profession) {
        return PROFESSIONS.register(name, profession);
    }

    public static Supplier<PoiType> registerMVPoiType(String name, Supplier<Set<BlockState>> matchingStates) {
        return POI_TYPES.register(name, () -> new PoiType(matchingStates.get(), 1, 1));
    }

    public static boolean isModLoadedMV(String id) {
        return ModList.get().isLoaded(id);
    }
}