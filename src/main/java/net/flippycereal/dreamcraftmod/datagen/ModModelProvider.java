package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MISTRIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUNDER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MISTRIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOUD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUNDER_CLOUD);

        blockStateModelGenerator.registerLog(ModBlocks.WHITE_OAK_LOG).log(ModBlocks.WHITE_OAK_LOG).wood(ModBlocks.WHITE_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WHITE_OAK_LOG).log(ModBlocks.STRIPPED_WHITE_OAK_LOG).wood(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_OAK_LEAVES);

        BlockStateModelGenerator.BlockTexturePool echoBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHO_BRICKS);
        echoBrickPool.wall(ModBlocks.ECHO_BRICKS_WALL);
        echoBrickPool.slab(ModBlocks.ECHO_BRICKS_SlAB);
        echoBrickPool.stairs(ModBlocks.ECHO_BRICKS_STAIRS);
        blockStateModelGenerator.registerLog(ModBlocks.ECHO_PILLAR).log(ModBlocks.ECHO_PILLAR);


        blockStateModelGenerator.registerLog(ModBlocks.PINK_IVORY_LOG).log(ModBlocks.PINK_IVORY_LOG).wood(ModBlocks.PINK_IVORY_WOOD);
        BlockStateModelGenerator.BlockTexturePool pinkIvoryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_IVORY_PLANKS);

        pinkIvoryPool.stairs(ModBlocks.PINK_IVORY_STAIRS);
        pinkIvoryPool.slab(ModBlocks.PINK_IVORY_SlAB);
        pinkIvoryPool.button(ModBlocks.PINK_IVORY_BUTTON);
        pinkIvoryPool.pressurePlate(ModBlocks.PINK_IVORY_PRESSURE_PLATE);
        pinkIvoryPool.fenceGate(ModBlocks.PINK_IVORY_FENCE_GATE);
        pinkIvoryPool.wall(ModBlocks.PINK_IVORY_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GAY_COMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISTRIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PRIDE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.THUNDER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ECHO_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHAFT, Models.HANDHELD);

        itemModelGenerator.register(ModItems.THUNDER, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MISTRIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MISTRIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MISTIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MISTIUM_BOOTS));

    }
}
