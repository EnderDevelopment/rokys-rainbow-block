package com.enderdevelopment.rokyblock.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import com.enderdevelopment.rokyblock.RokyBlockMod;

public class ModBlocks {
    public static final Block ROKY_BLOCK = new Block(
        AbstractBlock.Settings.create()
            .strength(3.0f, 6.0f)
    );

    public static final Block PENCIL_BLOCK = new Block(
        AbstractBlock.Settings.create()
            .strength(1.5f, 6.0f)
    );

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, RokyBlockMod.id("roky_block"), ROKY_BLOCK);
        Registry.register(Registries.BLOCK, RokyBlockMod.id("pencil_block"), PENCIL_BLOCK);
    }
}
