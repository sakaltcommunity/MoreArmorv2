package com.morearmor.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.item.Items;
import net.minecraft.item.ArmorMaterial;

public class SculkArmorMaterial implements ArmorMaterial {

    // 各部位の耐久値 (ヘルメット, チェストプレート, レギンス, ブーツ)
    private static final int[] DURABILITY = {371, 567, 499, 423};
    // 防御力 (ヘルメット, チェストプレート, レギンス, ブーツ)
    private static final int[] PROTECTION_VALUES = {2, 7, 6, 2};

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
        return 15; // エンチャント可能度
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE; // 装備時のサウンド
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.SCULK); // 修理に使用するアイテム（スカルクブロック）
    }

    @Override
    public String getName() {
        return "sculk"; // 材料名
    }

    @Override
    public float getToughness() {
        return 3.5f; // 防具のタフネス
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5f; // ノックバック耐性
    }
}
