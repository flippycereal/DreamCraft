package net.flippycereal.dreamcraftmod.enchantment;

import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment FROSTBITE = register("frostbite",
            new FrostbiteEnchantment(Enchantment.Rarity.RARE,
                    EquipmentSlot.MAINHAND));
    public static Enchantment LEECH = register("leech",
            new LeechEnchantment(Enchantment.Rarity.VERY_RARE,
                    EquipmentSlot.MAINHAND));
    public static Enchantment TOXIC = register("toxic",
            new ToxicEnchantment(Enchantment.Rarity.VERY_RARE,
                    EquipmentSlot.MAINHAND));
    public static Enchantment THUNDER_STRIKER = register("thunder_striker",
            new ThunderEnchantment(Enchantment.Rarity.VERY_RARE,
                    EquipmentSlot.MAINHAND));
    public static Enchantment ABDUCTION = register("abduction",
            new AbductionEnchantment(Enchantment.Rarity.VERY_RARE,
                   EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));



    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(DreamCraft.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
    }
}
