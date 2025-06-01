package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class MVItems {
    public static void init() {}

    public static <T extends Item> Supplier<T> registerMVItem(String name, Supplier<T> item) {
        return CommonPlatformHelper.registerMVItem(name, item);
    }

}
