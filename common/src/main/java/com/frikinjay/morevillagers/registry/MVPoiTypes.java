package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.mixin.PoiTypesInvoker;
import com.frikinjay.morevillagers.platform.CommonPlatformHelper;
import net.minecraft.world.entity.ai.village.poi.PoiType;

import java.util.function.Supplier;

public class MVPoiTypes {
    public static void init() {}

    public static final Supplier<PoiType> OCEANOGRAPHER_POI = CommonPlatformHelper.registerMVPoiType("oceanographer", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.OCEANOGRAPHY_TABLE.get()));
    public static final Supplier<PoiType> NETHERIAN_POI = CommonPlatformHelper.registerMVPoiType("netherian", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.DECAYED_WORKBENCH.get()));
    public static final Supplier<PoiType> WOODWORKER_POI = CommonPlatformHelper.registerMVPoiType("woodworker", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.WOODWORKING_TABLE.get()));
    public static final Supplier<PoiType> ENDERIAN_POI = CommonPlatformHelper.registerMVPoiType("enderian", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.PURPUR_ALTAR.get()));
    public static final Supplier<PoiType> ENGINEER_POI = CommonPlatformHelper.registerMVPoiType("engineer", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.BLUEPRINT_TABLE.get()));
    public static final Supplier<PoiType> FLORIST_POI = CommonPlatformHelper.registerMVPoiType("florist", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.GARDENING_TABLE.get()));
    public static final Supplier<PoiType> HUNTER_POI = CommonPlatformHelper.registerMVPoiType("hunter", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.HUNTING_POST.get()));
    public static final Supplier<PoiType> MINER_POI = CommonPlatformHelper.registerMVPoiType("miner", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.MINING_BENCH.get()));
    public static final Supplier<PoiType> ICEMAN_POI = CommonPlatformHelper.registerMVPoiType("iceman", () -> PoiTypesInvoker.invokeGetBlockStates(MVBlocks.CHILLER.get()));
}
