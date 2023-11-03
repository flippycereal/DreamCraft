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

    public static final Item ECHO_LONGSWORD = registerItem("echo_longsword",
            new EchoLongswordItem(ToolMaterials.NETHERITE, 7, -2.75f, new FabricItemSettings().fireproof()));

    public static final Item PRIDE_SCYTHE = registerItem("pride_scythe",
            new PrideScytheItem(ToolMaterials.NETHERITE, 4, -2.4f, new FabricItemSettings().maxDamage(2031)));

    public static final Item GAY_COMB = registerItem("gay_comb",
            new Item(new FabricItemSettings()));

    public static final Item HANDLE = registerItem("handle",
            new Item(new FabricItemSettings()));


    //Allows the items created by the mod to be registered
    public static final Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DreamCraft.MOD_ID, name), item);
    }
    public static void registerItem() {}
}
