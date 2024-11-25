package com.frikinjay.morevillagers.platform.neoforge;

import com.frikinjay.morevillagers.registry.neoforge.MVConfigNeoForge;

public class ConfigHelperImpl {
    public static boolean generatePlainsHouses() {
        return MVConfigNeoForge.GENERATE_PLAINS_HOUSES.get();
    }

    public static boolean generateTaigaHouses() {
        return MVConfigNeoForge.GENERATE_TAIGA_HOUSES.get();
    }

    public static boolean generateSavannaHouses() {
        return MVConfigNeoForge.GENERATE_SAVANNA_HOUSES.get();
    }

    public static boolean generateSnowyHouses() {
        return MVConfigNeoForge.GENERATE_SNOWY_HOUSES.get();
    }

    public static boolean generateDesertHouses() {
        return MVConfigNeoForge.GENERATE_DESERT_HOUSES.get();
    }

    public static int woodworkerHouseWeight() {
        return MVConfigNeoForge.WOODWORKER_HOUSE_WEIGHT.get();
    }

    public static int oceanographerHouseWeight() {
        return MVConfigNeoForge.OCEANOGRAPHER_HOUSE_WEIGHT.get();
    }

    public static int floristHouseWeight() {
        return MVConfigNeoForge.FLORIST_HOUSE_WEIGHT.get();
    }

    public static int hunterHouseWeight() {
        return MVConfigNeoForge.HUNTER_HOUSE_WEIGHT.get();
    }

    public static int engineerHouseWeight() {
        return MVConfigNeoForge.ENGINEER_HOUSE_WEIGHT.get();
    }
}
