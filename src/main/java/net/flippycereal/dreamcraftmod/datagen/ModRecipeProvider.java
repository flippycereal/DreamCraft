package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAND_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("B")
                .input('#', Items.SAND)
                .input('B', Items.BLAZE_ROD)
                .criterion(hasItem(Items.SAND), conditionsFromItem(Items.SAND))
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAND_SWORD)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_LONGSWORD, 1)
                .pattern("  #")
                .pattern("G# ")
                .pattern("DG ")
                .input('#', Items.ECHO_SHARD)
                .input('G', Items.GOLD_INGOT)
                .input('D', Items.DEEPSLATE)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_LONGSWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRIDE_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.GAY_COMB)
                .criterion(hasItem(ModItems.GAY_COMB), conditionsFromItem(ModItems.GAY_COMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PRIDE_BLOCK)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HANDLE, 1)
                .pattern("B#B")
                .input('#', Items.STICK)
                .input('B', Items.LEATHER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANDLE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PRIDE_SCYTHE, 1)
                .pattern("B##")
                .pattern(" H#")
                .pattern("H  ")
                .input('#', ModItems.GAY_COMB)
                .input('H', ModItems.HANDLE)
                .input('B', ModBlocks.PRIDE_BLOCK)
                .criterion(hasItem(ModItems.GAY_COMB), conditionsFromItem(ModItems.GAY_COMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRIDE_SCYTHE)));


        createStairsRecipe(ModBlocks.PINK_IVORY_STAIRS, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_IVORY_SlAB, ModBlocks.PINK_IVORY_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.PINK_IVORY_PRESSURE_PLATE, ModBlocks.PINK_IVORY_PLANKS);
        createFenceRecipe(ModBlocks.PINK_IVORY_FENCE, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        createFenceGateRecipe(ModBlocks.PINK_IVORY_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_IVORY_WALL, ModBlocks.PINK_IVORY_PLANKS);
        createDoorRecipe(ModBlocks.PINK_IVORY_DOOR, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.PINK_IVORY_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);



    }
}
