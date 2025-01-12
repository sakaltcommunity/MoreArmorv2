package com.morearmor.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LightningArmorMaterial implements ArmorMaterial {

    private static final int[] DURABILITY = {407, 592, 555, 481};
    private static final int[] PROTECTION_VALUES = {2, 8, 6, 2};
    private static final int ENCHANTABILITY = 20;

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
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.DIAMOND);
    }

    @Override
    public String getName() {
        return "lightning";
    }

    @Override
    public float getToughness() {
        return 4.0f; // 防具の強度
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5f; // ノックバック耐性
    }
}
