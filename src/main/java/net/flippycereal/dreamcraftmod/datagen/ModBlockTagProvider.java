package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PRIDE_ORE)
                .add(ModBlocks.MISTRIUM_ORE)
                .add(ModBlocks.THUNDER_ORE)
                .add(ModBlocks.PRIDE_BLOCK)
                .add(ModBlocks.MISTRIUM_BLOCK)
                .add(ModBlocks.CLOUD_BLOCK)
                .add(ModBlocks.THUNDER_CLOUD);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ECHO_BLOCK)
                .add(ModBlocks.ECHO_BRICKS)
                .add(ModBlocks.ECHO_PILLAR)
                .add(ModBlocks.ECHO_BRICKS_SlAB)
                .add(ModBlocks.ECHO_BRICKS_STAIRS)
                .add(ModBlocks.ECHO_BRICKS_WALL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ECHO_BLOCK)
                .add(ModBlocks.ECHO_BRICKS)
                .add(ModBlocks.ECHO_PILLAR)
                .add(ModBlocks.ECHO_BRICKS_SlAB)
                .add(ModBlocks.ECHO_BRICKS_STAIRS)
                .add(ModBlocks.ECHO_BRICKS_WALL)
                .add(ModBlocks.MISTRIUM_ORE)
                .add(ModBlocks.THUNDER_ORE)
                .add(ModBlocks.MISTRIUM_BLOCK)
                .add(ModBlocks.PRIDE_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WHITE_OAK_LOG)
                .add(ModBlocks.WHITE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_WHITE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_WHITE_OAK_LOG)
                .add(ModBlocks.WHITE_OAK_STAIRS)

                .add(ModBlocks.PINK_IVORY_LOG)
                .add(ModBlocks.PINK_IVORY_WOOD)
                .add(ModBlocks.PINK_IVORY_PLANKS);


        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_IVORY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_IVORY_WALL)
                .add(ModBlocks.ECHO_BRICKS_WALL);
    }
}
