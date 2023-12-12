package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.WHITE_OAK_PLANKS.asItem())
                .add(ModBlocks.PINK_IVORY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WHITE_OAK_LOG.asItem())
                .add(ModBlocks.WHITE_OAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_OAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_OAK_LOG.asItem())

                .add(ModBlocks.PINK_IVORY_LOG.asItem())
                .add(ModBlocks.PINK_IVORY_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MISTRIUM_HELMET,
                ModItems.MISTRIUM_CHESTPLATE,
                ModItems.MISTIUM_LEGGINGS,
                ModItems.MISTIUM_BOOTS);

    }
}
