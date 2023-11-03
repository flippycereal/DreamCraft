package net.flippycereal.dreamcraftmod.item;

import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class EchoLongswordItem extends SwordItem {

    public static double reach = 0;
    public static double attack_range = 0;
    private static LivingEntity liver = null;
    private static boolean active = false;


    public EchoLongswordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        reach = 1.5;
        attack_range = 1.5;
    }


    //Custom Attack Range Override
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (active != (((LivingEntity) entity).getStackInHand(Hand.MAIN_HAND).getItem() == this)) {
            System.out.println("New entity reaching: " + entity);
            liver = (LivingEntity) entity;
            SetRange(((LivingEntity) entity).getStackInHand(Hand.MAIN_HAND).getItem() == this);
        }
        active = ((LivingEntity) entity).getStackInHand(Hand.MAIN_HAND).getItem() == this;
    }

    public void SetRange(boolean change_range) {
        if (change_range) {
            System.out.println("On");
            liver.getAttributeInstance(ReachEntityAttributes.REACH).setBaseValue(reach);
            liver.getAttributeInstance(ReachEntityAttributes.ATTACK_RANGE).setBaseValue(attack_range);
        } else {
            System.out.println("Off");
            liver.getAttributeInstance(ReachEntityAttributes.REACH).setBaseValue(0.0);
            liver.getAttributeInstance(ReachEntityAttributes.ATTACK_RANGE).setBaseValue(0.0);
        }
    }

    private static Random random = new Random();

    @Override
    public TypedActionResult<ItemStack> use(World world,  PlayerEntity user,  Hand hand) {
            user.getItemCooldownManager().set(this, 120);

        for (int i = 0; i < 50; i++) {
            user.getWorld().addParticle(ParticleTypes.SONIC_BOOM, user.getX() + random.nextFloat(), user.getY() + random.nextFloat(), user.getZ() + random.nextFloat(), 0, 0.1, 0);
            user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_WARDEN_SONIC_BOOM, SoundCategory.AMBIENT, 3.0f, 1.0f);
            if (!world.isClient) {
                Vec3d vec3d = user.getRotationVector();
                Vec3d vec3d2 = user.getVelocity();
                user.setVelocity(vec3d2.add(vec3d.x * 3.5 - vec3d2.x * 0.5, vec3d.y * 2 - vec3d2.y, vec3d.z * 3.5 - vec3d2.z * 0.5));
                user.velocityModified = true;
                user.limitFallDistance();
            }
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        return null;
    }
}