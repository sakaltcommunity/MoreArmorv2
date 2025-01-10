package com.morearmor.registry;

import com.morearmor.items.SculkArmorItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry {

    public static void onInitialize() {
        // アイテムのレジストリ登録
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_helmet"), SculkArmorItem.SCULK_HELMET);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_chestplate"), SculkArmorItem.SCULK_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_leggings"), SculkArmorItem.SCULK_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_boots"), SculkArmorItem.SCULK_BOOTS);
    }
}
