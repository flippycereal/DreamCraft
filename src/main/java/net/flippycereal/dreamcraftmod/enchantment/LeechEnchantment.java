package net.flippycereal.dreamcraftmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class LeechEnchantment extends Enchantment {

    public LeechEnchantment(Enchantment.Rarity rarity, EquipmentSlot... slotTypes) {
        super(rarity, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (user.getHealth() <= user.getMaxHealth() / 2) {
            if (!user.getWorld().isClient()) {
                user.heal(3);
            }
            super.onTargetDamaged(user, target, level);
        }
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof AxeItem;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT
                && other != ModEnchantments.TOXIC
                && other != ModEnchantments.FROSTBITE
                && other != ModEnchantments.THUNDER_STRIKER
                && other != ModEnchantments.ABDUCTION;
    }
}
