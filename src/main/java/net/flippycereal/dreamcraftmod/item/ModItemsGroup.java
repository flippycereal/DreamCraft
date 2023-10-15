package net.flippycereal.dreamcraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {

    public static final ItemGroup DREAMCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DreamCraft.MOD_ID, "dreamcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dreamcraft"))
                    .icon(() -> new ItemStack(ModItems.SAND_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAND_SWORD);

                    }).build());




    public static void registerItemGroup() {
    }
}
