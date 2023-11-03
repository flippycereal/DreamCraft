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
                    .icon(() -> new ItemStack(ModItems.SAND_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAND_SWORD);
                        entries.add(ModItems.ECHO_LONGSWORD);
                        entries.add(ModItems.PRIDE_SCYTHE);
                        entries.add(ModItems.GAY_COMB);
                        entries.add(ModItems.HANDLE);

                        entries.add(ModBlocks.PRIDE_ORE);
                        entries.add(ModBlocks.PRIDE_BLOCK);

                        entries.add(ModBlocks.WHITE_OAK_LOG);
                        entries.add(ModBlocks.WHITE_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_WHITE_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
                        entries.add(ModBlocks.WHITE_OAK_LEAVES);
                        entries.add(ModBlocks.WHITE_OAK_PLANKS);

                        entries.add(ModBlocks.PINK_IVORY_LOG);
                        entries.add(ModBlocks.PINK_IVORY_WOOD);
                        entries.add(ModBlocks.PINK_IVORY_PLANKS);

                        entries.add(ModBlocks.PINK_IVORY_SlAB);
                        entries.add(ModBlocks.PINK_IVORY_WALL);
                        entries.add(ModBlocks.PINK_IVORY_STAIRS);
                        entries.add(ModBlocks.PINK_IVORY_DOOR);
                        entries.add(ModBlocks.PINK_IVORY_TRAPDOOR);
                        entries.add(ModBlocks.PINK_IVORY_BUTTON);
                        entries.add(ModBlocks.PINK_IVORY_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_IVORY_FENCE);
                        entries.add(ModBlocks.PINK_IVORY_FENCE_GATE);

                    }).build());




    public static void registerItemGroup() {
    }
}
