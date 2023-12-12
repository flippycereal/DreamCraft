package net.flippycereal.dreamcraftmod.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SandSwordItem extends SwordItem {
    public SandSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient && attacker.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            target.takeKnockback(20, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());

            if (target instanceof PlayerEntity) {
                (target).takeKnockback(10, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
