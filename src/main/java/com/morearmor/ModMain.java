package com.morearmor;

import com.morearmor.registry.ModRegistry;
import com.morearmor.events.ModEvents;
import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer {
    @Override
    public void onInitialize() {
        ModRegistry.registerItems();
        ModEvents.register();
    }
}
