package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PRIDE_ORE, prideOreDrops(ModBlocks.PRIDE_ORE, ModItems.GAY_COMB));

        addDrop(ModBlocks.PRIDE_BLOCK);


        addDrop(ModBlocks.WHITE_OAK_LOG);
        addDrop(ModBlocks.WHITE_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_WHITE_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
        addDrop(ModBlocks.WHITE_OAK_PLANKS);

        addDrop(ModBlocks.PINK_IVORY_LOG);
        addDrop(ModBlocks.PINK_IVORY_WOOD);
        addDrop(ModBlocks.PINK_IVORY_PLANKS);

        addDrop(ModBlocks.PINK_IVORY_STAIRS);
        addDrop(ModBlocks.PINK_IVORY_TRAPDOOR);
        addDrop(ModBlocks.PINK_IVORY_WALL);
        addDrop(ModBlocks.PINK_IVORY_FENCE);
        addDrop(ModBlocks.PINK_IVORY_FENCE_GATE);
        addDrop(ModBlocks.PINK_IVORY_BUTTON);
        addDrop(ModBlocks.PINK_IVORY_PRESSURE_PLATE);

        addDrop(ModBlocks.PINK_IVORY_DOOR, doorDrops(ModBlocks.PINK_IVORY_DOOR));
        addDrop(ModBlocks.PINK_IVORY_SlAB, slabDrops(ModBlocks.PINK_IVORY_SlAB));

        addDrop(ModBlocks.WHITE_OAK_LEAVES, leavesDrops(ModBlocks.WHITE_OAK_LEAVES, ModBlocks.PRIDE_ORE, 0.005f)); // TODO
    }


    public LootTable.Builder prideOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}