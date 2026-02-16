package com.yolanda.raymc.item;

import com.yolanda.raymc.RayMcMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GOD_SWORD = registerItem("god_sword", new GodSwordItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RayMcMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // 把神剑加入战斗物品栏
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(GOD_SWORD);
        });
    }
}

