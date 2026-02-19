package com.yolanda.raymc.item;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class NotchDiamondSwordItem extends SwordItem {

    public NotchDiamondSwordItem() {
        // 基础伤害1000000000，耐久度100000000
        super(ToolMaterials.DIAMOND, 1000000000, -2.4F,
                new Item.Settings().maxCount(1).maxDamage(100000000));
    }

    @Override
    public ItemStack getDefaultStack() {
        // 创建默认物品时自动附上经验修补
        ItemStack stack = new ItemStack(this);
        stack.addEnchantment(Enchantments.MENDING, 1);
        return stack;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // 一刀必杀：第一刀就造成100%伤害，直接击杀
        target.damage(attacker.getDamageSources().magic(), Float.MAX_VALUE);
        return super.postHit(stack, target, attacker);
    }
}
