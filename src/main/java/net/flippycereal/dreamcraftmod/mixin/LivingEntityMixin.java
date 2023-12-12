package net.flippycereal.dreamcraftmod.mixin;

import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


//This code was written by #7410 in the KaupenJoe Discord Server
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot equipmentSlot);

    @Inject(at = @At("HEAD"), method = "applyMovementEffects")
    private void applyMovementEffects(BlockPos pos, CallbackInfo ci) {
        if (getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.MISTIUM_BOOTS)) {
            FrostWalkerEnchantment.freezeWater((LivingEntity) (Object) this, ((LivingEntity) (Object) this).getWorld(), pos, 2);
        }
    }
}