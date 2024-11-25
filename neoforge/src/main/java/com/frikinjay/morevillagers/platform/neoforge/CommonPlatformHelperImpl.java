package com.frikinjay.morevillagers.platform.neoforge;

import com.frikinjay.morevillagers.MoreVillagers;
import net.minecraft.core.registries.BuiltInRegistries;
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
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MoreVillagers.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MoreVillagers.MOD_ID);
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, MoreVillagers.MOD_ID);
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, MoreVillagers.MOD_ID);

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        return PROFESSIONS.register(name, profession);
    }

    public static Supplier<PoiType> registerPoiType(String name, Supplier<Set<BlockState>> matchingStates) {
        return POI_TYPES.register(name, () -> new PoiType(matchingStates.get(), 1, 1));
    }

    public static boolean isModLoadedMV(String id) {
        return ModList.get().isLoaded(id);
    }
}