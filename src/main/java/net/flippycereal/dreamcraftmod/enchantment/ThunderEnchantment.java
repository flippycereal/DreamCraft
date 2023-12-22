package net.flippycereal.dreamcraftmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class ThunderEnchantment extends Enchantment {
    protected ThunderEnchantment(Rarity rarity, EquipmentSlot... slotTypes) {
        super(rarity, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld)user.getWorld();
            BlockPos position = target.getBlockPos();

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, SpawnReason.TRIGGERED, true, true);
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT
                && other != ModEnchantments.LEECH
                && other != ModEnchantments.FROSTBITE
                && other != ModEnchantments.TOXIC
                && other != ModEnchantments.ABDUCTION;
    }
}
