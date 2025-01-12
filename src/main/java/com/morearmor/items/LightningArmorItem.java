package com.morearmor.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class LightningArmorItem {
    public static final ArmorItem LIGHTNING_HELMET = new ArmorItem(new LightningArmorMaterial(), EquipmentSlot.HEAD, new ArmorItem.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem LIGHTNING_CHESTPLATE = new ArmorItem(new LightningArmorMaterial(), EquipmentSlot.CHEST, new ArmorItem.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem LIGHTNING_LEGGINGS = new ArmorItem(new LightningArmorMaterial(), EquipmentSlot.LEGS, new ArmorItem.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem LIGHTNING_BOOTS = new ArmorItem(new LightningArmorMaterial(), EquipmentSlot.FEET, new ArmorItem.Settings().group(ItemGroup.COMBAT).fireproof());
}
