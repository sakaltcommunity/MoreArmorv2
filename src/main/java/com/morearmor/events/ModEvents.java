package com.morearmor.events;

import com.morearmor.items.LightningArmorItem;
import net.fabricmc.fabric.api.entity.event.v1.LivingEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModEvents {

    public static void register() {
        // アイテムがマグマに落ちたときに消えないように処理を追加
        ServerTickEvents.START_SERVER_TICK.register(server -> {
            for (World world : server.getWorlds()) {
                for (ItemEntity itemEntity : world.getEntitiesByClass(ItemEntity.class, itemEntity -> true)) {
                    Item item = itemEntity.getStack().getItem();
                    if (item == LightningArmorItem.LIGHTNING_HELMET || item == LightningArmorItem.LIGHTNING_CHESTPLATE || item == LightningArmorItem.LIGHTNING_LEGGINGS || item == LightningArmorItem.LIGHTNING_BOOTS) {
                        // マグマに落ちても消えないように設定
                        if (itemEntity.isBurning()) {
                            itemEntity.setFireTicks(0); // 火の影響を受けない
                        }
                    }
                }
            }
        });

        // 防具を着ているプレイヤーに効果を与える
        LivingEntityEvents.TICK.register((entity) -> {
            if (entity instanceof PlayerEntity player) {
                if (player.getInventory().getArmorStack(2).getItem() == LightningArmorItem.LIGHTNING_CHESTPLATE) {
                    player.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.RESISTANCE, 10, 0, true, false));
                }
                if (player.getInventory().getArmorStack(3).getItem() == LightningArmorItem.LIGHTNING_BOOTS) {
                    player.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.SLOW_FALLING, 10, 0, true, false));
                }
            }
        });
    }
}
