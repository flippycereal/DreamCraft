package net.flippycereal.dreamcraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {

    public static final ItemGroup DREAMCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DreamCraft.MOD_ID, "dreamcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dreamcraft"))
                    .icon(() -> new ItemStack(ModBlocks.ECHO_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAND_SWORD);
                        entries.add(ModItems.ECHO_LONGSWORD);
                        entries.add(ModItems.ECHO_GLAIVE);
                        entries.add(ModItems.ECHO_AXE);
                        entries.add(ModItems.ECHO_BLADE);
                        entries.add(ModItems.PRIDE_SCYTHE);

                        entries.add(ModItems.SHAFT);
                        entries.add(ModItems.GAY_COMB);
                        entries.add(ModItems.HANDLE);

                        entries.add(ModBlocks.PRIDE_ORE);
                        entries.add(ModBlocks.PRIDE_BLOCK);
                        entries.add(ModBlocks.CLOUD_BLOCK);
                        entries.add(ModBlocks.THUNDER_CLOUD);
                        entries.add(ModBlocks.THUNDER_ORE);
                        entries.add(ModItems.THUNDER);

                        entries.add(ModItems.THUNDER_SHOVEL);
                        entries.add(ModItems.THUNDER_PICKAXE);
                        entries.add(ModItems.THUNDER_AXE);
                        entries.add(ModItems.THUNDER_HOE);

                        entries.add(ModBlocks.ECHO_BLOCK);
                        entries.add(ModBlocks.ECHO_BRICKS);
                        entries.add(ModBlocks.ECHO_BRICKS_SlAB);
                        entries.add(ModBlocks.ECHO_BRICKS_STAIRS);
                        entries.add(ModBlocks.ECHO_BRICKS_WALL);
                        entries.add(ModBlocks.ECHO_PILLAR);

                        entries.add(ModBlocks.MISTRIUM_ORE);
                        entries.add(ModItems.MISTRIUM);
                        entries.add(ModBlocks.MISTRIUM_BLOCK);
                        entries.add(ModItems.MISTRIUM_HELMET);
                        entries.add(ModItems.MISTRIUM_CHESTPLATE);
                        entries.add(ModItems.MISTIUM_LEGGINGS);
                        entries.add(ModItems.MISTIUM_BOOTS);

                        entries.add(ModBlocks.WHITE_OAK_LOG);
                        entries.add(ModBlocks.WHITE_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_WHITE_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
                        entries.add(ModBlocks.WHITE_OAK_LEAVES);
                        entries.add(ModBlocks.WHITE_OAK_PLANKS);
                        entries.add(ModBlocks.WHITE_OAK_STAIRS);

                        entries.add(ModBlocks.PINK_IVORY_LOG);
                        entries.add(ModBlocks.PINK_IVORY_WOOD);
                        entries.add(ModBlocks.PINK_IVORY_PLANKS);
                        entries.add(ModBlocks.PINK_IVORY_SlAB);
                        entries.add(ModBlocks.PINK_IVORY_WALL);
                        entries.add(ModBlocks.PINK_IVORY_STAIRS);
                        entries.add(ModBlocks.PINK_IVORY_BUTTON);
                        entries.add(ModBlocks.PINK_IVORY_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_IVORY_FENCE_GATE);
                    }).build());

    public static void registerItemGroup() {
    }
}
