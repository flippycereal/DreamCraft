package net.flippycereal.dreamcraftmod.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BipedEntityModel.class})
public abstract class BipedEntityModelMixin<T extends LivingEntity> extends AnimalModel<T> {
    @Shadow
    @Final
    public ModelPart body;

    @Shadow
    @Final
    public ModelPart head;

    public BipedEntityModelMixin() {

    }

    @Shadow
    protected abstract Arm getPreferredArm(T var1);

    @Shadow
    protected abstract ModelPart getArm(Arm var1);

    @Inject(
            method = {"animateArms"},
            at = {@At("TAIL")},
            cancellable = true
    )


    protected void dreamc$twoHanded(T entity, float animationProgress, CallbackInfo ci) {
        ItemStack stack = entity.getMainHandStack();
        if (stack.isOf(ModItems.ECHO_LONGSWORD) && !(this.handSwingProgress <= 0.0f)) {
            Arm arm = this.getPreferredArm(entity) == Arm.RIGHT ? Arm.LEFT : Arm.RIGHT;
            ModelPart modelPart = this.getArm(arm);
            float f = 1.0f - this.handSwingProgress;
            f *= f;
            f *= f;
            f = 1.0f - f;
            float g = MathHelper.sin(f * 3.1415927F);
            float h = MathHelper.sin(this.handSwingProgress * 3.1415927F) * -(this.head.pitch - 0.7f) * 0.75f;
            modelPart.pitch -= g * 1.2f + h;
            modelPart.yaw += this.body.yaw * 2.0f;
            modelPart.roll += MathHelper.sin(this.handSwingProgress * 3.1415927F) * -0.4f;
        }

    }
}
