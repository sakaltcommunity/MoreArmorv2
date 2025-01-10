package com.morearmor;

import com.morearmor.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer {

    @Override
    public void onInitialize() {
        // Modの初期化処理
        ModRegistry.onInitialize();
    }
}
