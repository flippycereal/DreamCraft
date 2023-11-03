package net.flippycereal.dreamcraftmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.particle.ModParticles;
import net.flippycereal.dreamcraftmod.particle.custom.EchoSweepParticle;
import net.minecraft.client.render.RenderLayer;

public class DreamCraftClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_IVORY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_IVORY_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_OAK_LEAVES, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(ModParticles.ECHO_SWEEP_ATTACK, EchoSweepParticle.Factory::new);

    }
}
