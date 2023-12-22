package net.flippycereal.dreamcraftmod.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;

import java.util.List;

public class EchoGlaiveItem extends SwordItem {

    private final float attackDamage;
    public final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;


    public EchoGlaiveItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.attackDamage = ToolMaterials.NETHERITE.getAttackDamage() + (float) attackDamage;
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", (double) this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", (double) attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        builder.put(ReachEntityAttributes.REACH, new EntityAttributeModifier("Attack range", 2.5, EntityAttributeModifier.Operation.ADDITION));
        builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier("Attack range", 2.5, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }


    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot) {
        return equipmentSlot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(equipmentSlot);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient && attacker.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            target.clearStatusEffects();
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity instanceof PlayerEntity player) {
            player.getHungerManager().setFoodLevel(20);
            player.getHungerManager().setSaturationLevel(3);
        }
    }

//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        if (!world.isClient) { // Make sure this runs on the server side
//            user.getItemCooldownManager().set(this, 120);
//            // Create a bounding box around the player
//            Box box = user.getBoundingBox().expand(5.0, 5.0, 5.0); // Expand method grows the box in every direction by the specified amount
//
//            List<Entity> entities = world.getOtherEntities(user, box); // getOtherEntities excludes the specified entity (in this case, player)
//
//
//            for(Entity entity : entities){
//                System.out.println("Entity name: " + entity.getEntityName());
//                System.out.println("Entity position: " + entity.getBlockPos().toString());
//                entity.getPos().subtract(user.getPos()).normalize().multiply(5).add(entity.getPos());
//            }
//        }
//        return super.use(world, user, hand);
//    }
}
