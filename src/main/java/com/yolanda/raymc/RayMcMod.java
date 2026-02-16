package com.yolanda.raymc;

import com.yolanda.raymc.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RayMcMod implements ModInitializer {

    public static final String MOD_ID = "ray_mc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // 注册物品
        ModItems.registerModItems();
        LOGGER.info("ray_mc Fabric mod initialized.");
    }
}

