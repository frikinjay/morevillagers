package com.frikinjay.morevillagers;

import com.frikinjay.morevillagers.platform.ConfigHelper;
import com.frikinjay.morevillagers.registry.MVBlocks;
import com.frikinjay.morevillagers.registry.MVGifts;
import com.frikinjay.morevillagers.registry.MVPoiTypes;
import com.frikinjay.morevillagers.registry.MVProfessions;
import com.frikinjay.morevillagers.util.JigsawHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

public class MoreVillagers
{
    public static final String MOD_ID = "morevillagers";
    public static final String AETHER_ID = "aether";
    public static final ResourceKey<CreativeModeTab> TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "tab"));

    public static void init() {
        MVBlocks.init();
        MVPoiTypes.init();
        MVProfessions.init();
        MVGifts.init();
    }

    public static void registerJigsaws(MinecraftServer server) {
        Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registries.TEMPLATE_POOL).orElseThrow();
        Registry<StructureProcessorList> processorListRegistry = server.registryAccess().registry(Registries.PROCESSOR_LIST).orElseThrow();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft", "village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft", "village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft", "village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft", "village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft", "village/taiga/houses");

        // PLAINS VILLAGE HOUSES
        if (ConfigHelper.generatePlainsHouses()) {
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_woodworker", ConfigHelper.woodworkerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_oceanographer", ConfigHelper.oceanographerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_florist", ConfigHelper.floristHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_hunter", ConfigHelper.hunterHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_engineer", ConfigHelper.engineerHouseWeight());
        }

        // TAIGA VILLAGE HOUSES
        if (ConfigHelper.generateTaigaHouses()) {
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_woodworker", ConfigHelper.woodworkerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_oceanographer", ConfigHelper.oceanographerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_florist", ConfigHelper.floristHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_hunter", ConfigHelper.hunterHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_engineer", ConfigHelper.engineerHouseWeight());
        }

        // SAVANNA VILLAGE HOUSES
        if (ConfigHelper.generateSavannaHouses()) {
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_woodworker", ConfigHelper.woodworkerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_oceanographer", ConfigHelper.oceanographerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_florist", ConfigHelper.floristHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_hunter", ConfigHelper.hunterHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_engineer", ConfigHelper.engineerHouseWeight());
        }

        // SNOWY VILLAGE HOUSES
        if (ConfigHelper.generateSnowyHouses()) {
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_woodworker", ConfigHelper.woodworkerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_oceanographer", ConfigHelper.oceanographerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_florist", ConfigHelper.floristHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_hunter", ConfigHelper.hunterHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_engineer", ConfigHelper.engineerHouseWeight());
        }

        // DESERT VILLAGE HOUSES
        if (ConfigHelper.generateDesertHouses()) {
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_woodworker", ConfigHelper.woodworkerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_oceanographer", ConfigHelper.oceanographerHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_florist", ConfigHelper.floristHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_hunter", ConfigHelper.hunterHouseWeight());
            JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_hunter_engineer", ConfigHelper.engineerHouseWeight());
        }
    }

    public static ResourceLocation getRL(String modid, String location) {
        return new ResourceLocation(modid, location);
    }
}