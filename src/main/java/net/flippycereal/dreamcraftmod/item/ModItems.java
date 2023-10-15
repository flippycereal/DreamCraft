package net.flippycereal.dreamcraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAND_SWORD = registerItem("sand_sword",
            new SandSwordItem(ToolMaterials.STONE, 0, -2, new FabricItemSettings()));


    //Allows the items created by the mod to be registered
    public static final Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DreamCraft.MOD_ID, name), item);
    }
    public static void registerItem() {
    }
}
