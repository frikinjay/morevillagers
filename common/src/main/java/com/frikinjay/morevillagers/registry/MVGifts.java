package com.frikinjay.morevillagers.registry;

import com.frikinjay.morevillagers.MoreVillagers;
import com.frikinjay.morevillagers.mixin.GiveGiftToHeroAccessor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Map;

public class MVGifts {
    public static void init() { }
    //private static final Logger LOGGER = LoggerFactory.getLogger(MoreVillagers.MOD_ID);

    public static final ResourceKey<LootTable> OCEANOGRAPHER_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/oceanographer_gift");
    public static final ResourceKey<LootTable> NETHERIAN_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/netherian_gift");
    public static final ResourceKey<LootTable> WOODWORKER_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/woodworker_gift");
    public static final ResourceKey<LootTable> ENDERIAN_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/enderian_gift");
    public static final ResourceKey<LootTable> ENGINEER_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/engineer_gift");
    public static final ResourceKey<LootTable> FLORIST_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/florist_gift");
    public static final ResourceKey<LootTable> HUNTER_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/hunter_gift");
    public static final ResourceKey<LootTable> MINER_GIFT = registerGiftTable(
            "gameplay/hero_of_the_village/miner_gift");

    public static void registerGiftMappings() {
        Map<VillagerProfession, ResourceKey<LootTable>> gifts = GiveGiftToHeroAccessor.getGifts();

        registerGiftsFor(gifts, MVProfessions.OCEANOGRAPHER.get(), OCEANOGRAPHER_GIFT);
        registerGiftsFor(gifts, MVProfessions.NETHERIAN.get(), NETHERIAN_GIFT);
        registerGiftsFor(gifts, MVProfessions.WOODWORKER.get(), WOODWORKER_GIFT);
        registerGiftsFor(gifts, MVProfessions.ENDERIAN.get(), ENDERIAN_GIFT);
        registerGiftsFor(gifts, MVProfessions.ENGINEER.get(), ENGINEER_GIFT);
        registerGiftsFor(gifts, MVProfessions.FLORIST.get(), FLORIST_GIFT);
        registerGiftsFor(gifts, MVProfessions.HUNTER.get(), HUNTER_GIFT);
        registerGiftsFor(gifts, MVProfessions.MINER.get(), MINER_GIFT);
    }

    private static ResourceKey<LootTable> registerGiftTable(String path) {
        return ResourceKey.create(
                Registries.LOOT_TABLE,
                new ResourceLocation(MoreVillagers.MOD_ID, path)
        );
    }

    private static void registerGiftsFor(Map<VillagerProfession, ResourceKey<LootTable>> gifts,
                                           VillagerProfession profession,
                                           ResourceKey<LootTable> giftTable) {
        if (profession == null) {
            return;
        }
        gifts.put(profession, giftTable);
    }
}
