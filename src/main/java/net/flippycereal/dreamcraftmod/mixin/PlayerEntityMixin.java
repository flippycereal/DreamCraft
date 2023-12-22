package net.flippycereal.dreamcraftmod.mixin;

import net.flippycereal.dreamcraftmod.enchantment.ModEnchantments;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.flippycereal.dreamcraftmod.particle.ModParticles;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerEntity.class})
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(
            method = {"attack"},
            at = {@At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/player/PlayerEntity;addCritParticles(Lnet/minecraft/entity/Entity;)V"
            )}
    )
    private void attack(Entity target, CallbackInfo ci) {
        if (EnchantmentHelper.getEquipmentLevel(ModEnchantments.ABDUCTION, this) > 0) {
            target.setVelocity(this.getPos().subtract(target.getPos()).multiply(0.25));
            target.velocityModified = true;
        }
    }
}
