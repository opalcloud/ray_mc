package com.yolanda.raymc.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class GodSwordItem extends SwordItem {

    public GodSwordItem() {
        // 以下界合金为基础，附加极高伤害
        super(ToolMaterials.NETHERITE, 10000, -2.4F,
                new Item.Settings().maxCount(1));
    }

    // 禁止任何形式的附魔

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }
}

