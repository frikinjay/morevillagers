package com.frikinjay.morevillagers.util;

import com.mojang.datafixers.util.Pair;
import com.frikinjay.morevillagers.mixin.StructureTemplatePoolAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import java.util.ArrayList;
import java.util.List;

public class JigsawHelper {
    private static final ResourceKey<StructureProcessorList> EMPTY_PROCESSOR_LIST_KEY =
            ResourceKey.create(Registries.PROCESSOR_LIST, Identifier.withDefaultNamespace("empty"));

    public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry,
                                         Registry<StructureProcessorList> processorListRegistry,
                                         Identifier poolRL,
                                         String nbtPieceRL,
                                         int weight) {
        Holder.Reference<StructureProcessorList> emptyProcessorList = processorListRegistry.get(EMPTY_PROCESSOR_LIST_KEY.identifier())
                .orElseThrow(() -> new IllegalStateException("Empty processor list not found"));

        Holder.Reference<StructureTemplatePool> poolHolder = templatePoolRegistry.get(poolRL)
                .orElse(null);

        if (poolHolder == null) return;

        StructureTemplatePool pool = poolHolder.value();

        SinglePoolElement piece = SinglePoolElement.single(nbtPieceRL, emptyProcessorList)
                .apply(StructureTemplatePool.Projection.RIGID);

        StructureTemplatePoolAccessor poolAccessor = (StructureTemplatePoolAccessor) pool;

        for (int i = 0; i < weight; i++) {
            poolAccessor.getTemplates().add(piece);
        }

        List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(poolAccessor.getRawTemplates());
        listOfPieceEntries.add(new Pair<>(piece, weight));
        poolAccessor.setRawTemplates(listOfPieceEntries);
    }
}