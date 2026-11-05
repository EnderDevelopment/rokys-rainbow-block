package com.enderdevelopment.rokyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import com.enderdevelopment.rokyblock.RokyBlockMod;
import com.enderdevelopment.rokyblock.block.ModBlocks;

public class ModItems {

    public static final Item ROKY_BLOCK_ITEM = new BlockItem(
        ModBlocks.ROKY_BLOCK,
        new Item.Settings()
    );

    public static final Item PENCIL_BLOCK_ITEM = new BlockItem(
        ModBlocks.PENCIL_BLOCK,
        new Item.Settings()
    );

    public static void registerItems() {
        Registry.register(Registries.ITEM, RokyBlockMod.id("roky_block"), ROKY_BLOCK_ITEM);
        Registry.register(Registries.ITEM, RokyBlockMod.id("pencil_block"), PENCIL_BLOCK_ITEM);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ROKY_BLOCK_ITEM);
            entries.add(PENCIL_BLOCK_ITEM);
        });
    }
}
