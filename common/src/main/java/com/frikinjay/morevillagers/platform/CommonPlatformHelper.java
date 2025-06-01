package com.frikinjay.morevillagers.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;
import java.util.function.Supplier;

public class CommonPlatformHelper {
    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerMVBlock(String name, Supplier<T> block) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerMVItem(String name, Supplier<T> item) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<VillagerProfession> registerMVProfession(String name, Supplier<VillagerProfession> profession) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<PoiType> registerMVPoiType(String name, Supplier<Set<BlockState>> matchingStates) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isModLoadedMV(String id) {
        throw new AssertionError();
    }
}
