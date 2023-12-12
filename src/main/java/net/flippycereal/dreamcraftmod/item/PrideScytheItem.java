package net.flippycereal.dreamcraftmod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class PrideScytheItem extends SwordItem {
    public PrideScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    private static Random random = new Random();


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.getItemCooldownManager().set(this, 120);
        user.fallDistance = 0;
        for (int i = 0; i < 50; i++) {
            user.getWorld().addParticle(ParticleTypes.CLOUD, user.getX() + random.nextFloat(), user.getY() + random.nextFloat(), user.getZ() + random.nextFloat(), 0, 0.1, 0);
            user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_FIREWORK_ROCKET_LAUNCH, SoundCategory.AMBIENT, 3.0f, 1.0f);
            if (!world.isClient) {
                Vec3d vec3d = user.getRotationVector();
                Vec3d vec3d2 = user.getVelocity();
                user.setVelocity(vec3d2.add(vec3d.x * 2.5 - vec3d2.x * 0.5, vec3d.y * 1.5 - vec3d2.y * 0.5, vec3d.z * 2.5 - vec3d2.z * 0.5));
                user.velocityModified = true;

            }
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
