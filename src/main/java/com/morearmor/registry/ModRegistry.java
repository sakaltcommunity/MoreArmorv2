package com.morearmor.registry;

import com.morearmor.items.SculkArmorItem;
import com.morearmor.items.LightningArmorItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry {

    public static void onInitialize() {
        // Sculk防具のレジストリ登録
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_helmet"), SculkArmorItem.SCULK_HELMET);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_chestplate"), SculkArmorItem.SCULK_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_leggings"), SculkArmorItem.SCULK_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "sculk_boots"), SculkArmorItem.SCULK_BOOTS);

        // Lightning防具のレジストリ登録
        Registry.register(Registry.ITEM, new Identifier("morearmor", "lightning_helmet"), LightningArmorItem.LIGHTNING_HELMET);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "lightning_chestplate"), LightningArmorItem.LIGHTNING_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "lightning_leggings"), LightningArmorItem.LIGHTNING_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("morearmor", "lightning_boots"), LightningArmorItem.LIGHTNING_BOOTS);
    }
}
