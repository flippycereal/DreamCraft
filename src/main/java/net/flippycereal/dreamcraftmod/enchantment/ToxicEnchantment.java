package net.flippycereal.dreamcraftmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class ToxicEnchantment extends Enchantment {
    protected ToxicEnchantment(Rarity rarity, EquipmentSlot... slotTypes) {
        super(rarity, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 400, 2));
        }

        super.onTargetDamaged(user, target, level);
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem;
    }
    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT
                && other != ModEnchantments.LEECH
                && other != ModEnchantments.FROSTBITE
                && other != ModEnchantments.THUNDER_STRIKER
                && other != ModEnchantments.ABDUCTION;
    }
}
