package com.yolanda.raymc.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class DoubleSwordItem extends SwordItem {

    public DoubleSwordItem() {
        // 以下界合金为基础，但基础伤害为 0，主要伤害逻辑在 postHit 中处理
        super(ToolMaterials.NETHERITE, 0, -2.4F,
                new Item.Settings().maxCount(1));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        float maxHealth = target.getMaxHealth();
        float halfHealth = maxHealth * 0.5F;

        // 第一次命中：把血量压到最大生命值的 50%
        if (target.getHealth() > halfHealth) {
            target.setHealth(halfHealth);
        } else {
            // 第二次及之后命中：直接击杀，尽量绕过护甲等减免
            target.damage(attacker.getDamageSources().magic(), Float.MAX_VALUE);
        }

        return super.postHit(stack, target, attacker);
    }
}

