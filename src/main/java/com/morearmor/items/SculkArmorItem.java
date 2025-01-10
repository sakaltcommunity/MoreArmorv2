package com.morearmor.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ArmorMaterial;

public class SculkArmorItem extends ArmorItem {

    // 各部位の防具アイテム
    public static final Item SCULK_HELMET = new SculkArmorItem(new SculkArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SCULK_CHESTPLATE = new SculkArmorItem(new SculkArmorMaterial(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SCULK_LEGGINGS = new SculkArmorItem(new SculkArmorMaterial(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SCULK_BOOTS = new SculkArmorItem(new SculkArmorMaterial(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    // コンストラクタ
    public SculkArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        super(material, slot, settings);
    }
}
