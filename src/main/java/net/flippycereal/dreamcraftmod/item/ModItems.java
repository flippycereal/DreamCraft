package net.flippycereal.dreamcraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item SAND_SWORD = registerItem("sand_sword",
            new SandSwordItem(ToolMaterials.WOOD, 0, -2, new FabricItemSettings()));
    public static final Item ECHO_LONGSWORD = registerItem("echo_longsword",
            new EchoLongswordItem(ToolMaterials.NETHERITE, 4, -2.75f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC).maxDamage(-1)));
    public static final Item ECHO_AXE = registerItem("echo_axe",
            new EchoAxeItem(ToolMaterials.NETHERITE, 6, -3F, new FabricItemSettings().fireproof().rarity(Rarity.EPIC).maxDamage(-1)));
    public static final Item PRIDE_SCYTHE = registerItem("pride_scythe",
            new PrideScytheItem(ToolMaterials.GOLD, 6, -2.4f, new FabricItemSettings().maxDamage(2031).rarity(Rarity.RARE)));
    public static final Item ECHO_GLAIVE = registerItem("echo_glaive",
            new EchoGlaiveItem(ToolMaterials.NETHERITE, 1, -1.75f, new FabricItemSettings().maxDamage(-1).fireproof().rarity(Rarity.EPIC)));
    public static final Item ECHO_BLADE = registerItem("echo_blade",
            new AxeItem(ToolMaterials.IRON, 2, 0, new FabricItemSettings().rarity(Rarity.RARE).maxCount(1)));

    public static final Item THUNDER_PICKAXE = registerItem("thunder_pickaxe",
            new PickaxeItem(ModToolMaterial.THUNDER, 1, -2.8f, new FabricItemSettings()));
    public static final Item THUNDER_AXE = registerItem("thunder_axe",
            new AxeItem(ModToolMaterial.THUNDER, 5, -3.0f, new FabricItemSettings()));
    public static final Item THUNDER_SHOVEL = registerItem("thunder_shovel",
            new ShovelItem(ModToolMaterial.THUNDER, 1, -3.0f, new FabricItemSettings()));
    public static final Item THUNDER_HOE = registerItem("thunder_hoe",
            new HoeItem(ModToolMaterial.THUNDER, -4, 0.0f, new FabricItemSettings()));

    public static final Item SHAFT = registerItem("shaft",
            new Item(new FabricItemSettings()));
    public static final Item GAY_COMB = registerItem("gay_comb",
            new Item(new FabricItemSettings()));
    public static final Item HANDLE = registerItem("handle",
            new Item(new FabricItemSettings()));
    public static final Item MISTRIUM = registerItem("mistrium",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item THUNDER = registerItem("thunder",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item MISTRIUM_HELMET = registerItem("mistium_helmet",
            new ArmorItem(ModArmorMaterial.MISTIUM, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MISTRIUM_CHESTPLATE = registerItem("mistium_chestplate",
            new ArmorItem(ModArmorMaterial.MISTIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MISTIUM_LEGGINGS = registerItem("mistium_leggings",
            new ArmorItem(ModArmorMaterial.MISTIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MISTIUM_BOOTS = registerItem("mistium_boots",
            new ModArmorItem(ModArmorMaterial.MISTIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE)));


    //Allows the items created by the mod to be registered
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DreamCraft.MOD_ID, name), item);
    }

    public static void registerItem() {
    }
}
