package net.flippycereal.dreamcraftmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class AbductionEnchantment extends Enchantment {
    protected AbductionEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }


    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT
                && other != ModEnchantments.LEECH
                && other != ModEnchantments.TOXIC
                && other != ModEnchantments.THUNDER_STRIKER
                && other != ModEnchantments.FROSTBITE;
    }
}