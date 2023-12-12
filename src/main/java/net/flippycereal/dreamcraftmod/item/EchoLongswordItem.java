package net.flippycereal.dreamcraftmod.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.flippycereal.dreamcraftmod.particle.ModParticles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class EchoLongswordItem extends SwordItem {
    public final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public EchoLongswordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(ReachEntityAttributes.REACH, new EntityAttributeModifier("Attack range", 1.3, EntityAttributeModifier.Operation.ADDITION));
        builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier("Attack range", 1.3, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity) {
            SoundEvent sound = SoundEvents.ENTITY_PLAYER_ATTACK_STRONG;
            attacker.getWorld().playSound((PlayerEntity)null, target.getX(), target.getY(), target.getZ(), sound, attacker.getSoundCategory(), 1.0F, 1.0F);
        }

        return super.postHit(stack, target, attacker);
    }

    private static Random random = new Random();

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            user.getItemCooldownManager().set(this, 120);

        for (int i = 0; i < 50; i++) {
            user.getWorld().addParticle(ParticleTypes.SONIC_BOOM, true, user.getX() + random.nextFloat(), user.getY() + random.nextFloat(), user.getZ() + random.nextFloat(), 0, 0.1, 0);
            user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_WARDEN_SONIC_BOOM, SoundCategory.NEUTRAL, 3.0f, 1.0f);
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