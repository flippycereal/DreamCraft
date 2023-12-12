package net.flippycereal.dreamcraftmod.mixin;

import net.flippycereal.dreamcraftmod.item.ModItems;
import net.flippycereal.dreamcraftmod.particle.ModParticles;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({PlayerEntity.class})
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @ModifyArg(
            method = {"spawnSweepAttackParticles"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/server/world/ServerWorld;spawnParticles(Lnet/minecraft/particle/ParticleEffect;DDDIDDDD)I"
            )
    )
    private <T extends ParticleEffect> T dreamcraft$disableSweepingHack(T value) {
        return this.getStackInHand(Hand.MAIN_HAND).getItem() == ModItems.ECHO_LONGSWORD ? (T) ModParticles.ECHO_SWEEP_ATTACK : value;
    }
}
