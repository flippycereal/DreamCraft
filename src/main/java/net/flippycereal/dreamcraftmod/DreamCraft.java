package net.flippycereal.dreamcraftmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.enchantment.ModEnchantments;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.flippycereal.dreamcraftmod.item.ModItemsGroup;
import net.flippycereal.dreamcraftmod.particle.ModParticles;
import net.flippycereal.dreamcraftmod.world.gen.ModWorldGeneration;

public class DreamCraft implements ModInitializer {
    public static final String MOD_ID = "dreamcraftmod";
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItems.registerItem();
        ModBlocks.registerModBlocks();

        ModItemsGroup.registerItemGroup();

        ModParticles.registerParticles();

        ModEnchantments.registerModEnchantments();


        StrippableBlockRegistry.register(ModBlocks.WHITE_OAK_LOG, ModBlocks.STRIPPED_WHITE_OAK_LOG);
        StrippableBlockRegistry.register(ModBlocks.WHITE_OAK_WOOD, ModBlocks.STRIPPED_WHITE_OAK_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_OAK_WOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_OAK_LEAVES, 30, 60);

        ModWorldGeneration.generateModWorldGen();
    }
}
