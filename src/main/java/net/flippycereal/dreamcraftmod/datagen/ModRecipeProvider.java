package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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
                .pattern(" E#")
                .pattern("G#E")
                .pattern("DG ")
                .input('#', Items.ECHO_SHARD)
                .input('G', Items.GOLD_BLOCK)
                .input('D', Items.DEEPSLATE)
                .input('E', Items.ENDER_EYE)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_LONGSWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_GLAIVE, 1)
                .pattern("  #")
                .pattern(" DG")
                .pattern("D  ")
                .input('#', ModItems.ECHO_BLADE)
                .input('G', Items.GLOW_BERRIES)
                .input('D', ModItems.SHAFT)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_GLAIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_BLADE, 1)
                .pattern(" #S")
                .pattern("DG#")
                .pattern("GD ")
                .input('#', Items.ECHO_SHARD)
                .input('G', ModItems.SHAFT)
                .input('D', Items.GOLD_BLOCK)
                .input('S', Items.NETHERITE_SWORD)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_BLADE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_AXE, 1)
                .pattern("ZS#")
                .pattern(" D#")
                .pattern("G  ")
                .input('#', ModBlocks.ECHO_BLOCK)
                .input('G', ModItems.SHAFT)
                .input('D', Items.BLAZE_ROD)
                .input('S', Items.NETHERITE_INGOT)
                .input('Z', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRIDE_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.GAY_COMB)
                .criterion(hasItem(ModItems.GAY_COMB), conditionsFromItem(ModItems.GAY_COMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PRIDE_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MISTRIUM_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.MISTRIUM)
                .criterion(hasItem(ModItems.MISTRIUM), conditionsFromItem(ModItems.MISTRIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MISTRIUM_BLOCK)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HANDLE, 1)
                .pattern("B#B")
                .input('#', Items.STICK)
                .input('B', Items.LEATHER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANDLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHAFT, 1)
                .pattern("B#B")
                .input('#', ModItems.HANDLE)
                .input('B', Items.DEEPSLATE)
                .criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SHAFT)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PRIDE_SCYTHE, 1)
                .pattern("B##")
                .pattern(" H#")
                .pattern("H  ")
                .input('#', ModItems.GAY_COMB)
                .input('H', ModItems.HANDLE)
                .input('B', ModBlocks.PRIDE_BLOCK)
                .criterion(hasItem(ModItems.GAY_COMB), conditionsFromItem(ModItems.GAY_COMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRIDE_SCYTHE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MISTRIUM_HELMET, 1)
                .pattern("MHM")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.MISTRIUM)
                .input('M', ModBlocks.MISTRIUM_BLOCK)
                .input('H', Items.NETHERITE_HELMET)
                .criterion(hasItem(ModItems.MISTRIUM), conditionsFromItem(ModItems.MISTRIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MISTRIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MISTRIUM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("MHM")
                .pattern("###")
                .input('#', ModItems.MISTRIUM)
                .input('M', ModBlocks.MISTRIUM_BLOCK)
                .input('H', Items.NETHERITE_CHESTPLATE)
                .criterion(hasItem(ModItems.MISTRIUM), conditionsFromItem(ModItems.MISTRIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MISTRIUM_CHESTPLATE)));
///
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MISTIUM_LEGGINGS, 1)
                .pattern("MHM")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.MISTRIUM)
                .input('M', ModBlocks.MISTRIUM_BLOCK)
                .input('H', Items.NETHERITE_LEGGINGS)
                .criterion(hasItem(ModItems.MISTRIUM), conditionsFromItem(ModItems.MISTRIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MISTIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MISTIUM_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("MHM")
                .input('#', ModItems.MISTRIUM)
                .input('M', ModBlocks.MISTRIUM_BLOCK)
                .input('H', Items.NETHERITE_BOOTS)
                .criterion(hasItem(ModItems.MISTRIUM), conditionsFromItem(ModItems.MISTRIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MISTIUM_BOOTS)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THUNDER_SHOVEL, 1)
                .pattern(" M ")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('M', ModItems.THUNDER)
                .criterion(hasItem(ModItems.THUNDER_SHOVEL), conditionsFromItem(ModItems.THUNDER_SHOVEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.THUNDER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THUNDER_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('M', ModItems.THUNDER)
                .criterion(hasItem(ModItems.THUNDER_PICKAXE), conditionsFromItem(ModItems.THUNDER_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.THUNDER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THUNDER_AXE, 1)
                .pattern(" MM")
                .pattern(" #M")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('M', ModItems.THUNDER)
                .criterion(hasItem(ModItems.THUNDER_AXE), conditionsFromItem(ModItems.THUNDER_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.THUNDER_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THUNDER_HOE, 1)
                .pattern(" MM")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('M', ModItems.THUNDER)
                .criterion(hasItem(ModItems.THUNDER_HOE), conditionsFromItem(ModItems.THUNDER_HOE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.THUNDER_HOE)));


        createStairsRecipe(ModBlocks.PINK_IVORY_STAIRS, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_IVORY_SlAB, ModBlocks.PINK_IVORY_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.PINK_IVORY_PRESSURE_PLATE, ModBlocks.PINK_IVORY_PLANKS);
        createFenceGateRecipe(ModBlocks.PINK_IVORY_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_IVORY_PLANKS)).criterion(hasItem(ModBlocks.PINK_IVORY_PLANKS), conditionsFromItem(ModBlocks.PINK_IVORY_PLANKS)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_IVORY_WALL, ModBlocks.PINK_IVORY_PLANKS);
        createStairsRecipe(ModBlocks.ECHO_BRICKS, Ingredient.ofItems(ModBlocks.ECHO_BRICKS)).criterion(hasItem(ModBlocks.ECHO_BRICKS), conditionsFromItem(ModBlocks.ECHO_BRICKS)).offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_BRICKS_SlAB, ModBlocks.ECHO_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_BRICKS_WALL, ModBlocks.ECHO_BRICKS);
    }
}
