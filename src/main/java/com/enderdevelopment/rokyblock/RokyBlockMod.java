package com.enderdevelopment.rokyblock;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.enderdevelopment.rokyblock.block.ModBlocks;
import com.enderdevelopment.rokyblock.item.ModItems;

public class RokyBlockMod implements ModInitializer {
    public static final String MOD_ID = "rokyblock";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();

        LOGGER.info("Roky Block mod initialized!");
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
