package net.flippycereal.dreamcraftmod;

import net.fabricmc.api.ModInitializer;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.flippycereal.dreamcraftmod.item.ModItemsGroup;

public class DreamCraft implements ModInitializer {

    public static final String MOD_ID = "dreamcraftmod";
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItems.registerItem();
        ModItemsGroup.registerItemGroup();
    }
}
