package com.morearmor.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class QuartzArmorMaterial implements ArmorMaterial {
    private static final int[] DURABILITY = {256, 482, 391, 306};
    private static final int[] PROTECTION_VALUES = {2, 7, 5, 2};
    private static final int ENCHANTABILITY = 16; // エンチャント適性（ダイヤ装備に近い）

    private static final float TOUGHNESS = 0.0f;
    private static final float KNOCKBACK_RESISTANCE = 0.0f;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return ENCHANTABILITY;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.QUARTZ); // 修理素材: クォーツ
    }

    @Override
    public String getName() {
        return "quartz";
    }

    @Override
    public float getToughness() {
        return TOUGHNESS;
    }

    @Override
    public float getKnockbackResistance() {
        return KNOCKBACK_RESISTANCE;
    }
}
