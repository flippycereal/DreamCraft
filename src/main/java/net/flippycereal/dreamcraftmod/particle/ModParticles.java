package net.flippycereal.dreamcraftmod.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType ECHO_SWEEP_ATTACK = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(DreamCraft.MOD_ID, "echo_sweep_attack"),
                ECHO_SWEEP_ATTACK);
    }
}
