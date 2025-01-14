package com.morearmor.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.entity.EquipmentSlot;

public class QuartzArmorItem {
    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new QuartzArmorMaterial();

    public static final Item QUARTZ_HELMET = new ArmorItem(
        QUARTZ_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item QUARTZ_CHESTPLATE = new ArmorItem(
        QUARTZ_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item QUARTZ_LEGGINGS = new ArmorItem(
        QUARTZ_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item QUARTZ_BOOTS = new ArmorItem(
        QUARTZ_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
}
