package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.WHITE_OAK_LOG).log(ModBlocks.WHITE_OAK_LOG).wood(ModBlocks.WHITE_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WHITE_OAK_LOG).log(ModBlocks.STRIPPED_WHITE_OAK_LOG).wood(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_OAK_LEAVES);


        blockStateModelGenerator.registerLog(ModBlocks.PINK_IVORY_LOG).log(ModBlocks.PINK_IVORY_LOG).wood(ModBlocks.PINK_IVORY_WOOD);
        BlockStateModelGenerator.BlockTexturePool pinkIvoryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_IVORY_PLANKS);

        pinkIvoryPool.stairs(ModBlocks.PINK_IVORY_STAIRS);
        pinkIvoryPool.slab(ModBlocks.PINK_IVORY_SlAB);
        pinkIvoryPool.button(ModBlocks.PINK_IVORY_BUTTON);
        pinkIvoryPool.pressurePlate(ModBlocks.PINK_IVORY_PRESSURE_PLATE);
        pinkIvoryPool.fence(ModBlocks.PINK_IVORY_FENCE);
        pinkIvoryPool.fenceGate(ModBlocks.PINK_IVORY_FENCE_GATE);
        pinkIvoryPool.wall(ModBlocks.PINK_IVORY_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_IVORY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_IVORY_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GAY_COMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PRIDE_SCYTHE, Models.HANDHELD);

    }
}
