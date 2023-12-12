package net.flippycereal.dreamcraftmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.flippycereal.dreamcraftmod.block.ModBlocks;
import net.flippycereal.dreamcraftmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
        addDrop(ModBlocks.PRIDE_ORE, multipleOreDrops(ModBlocks.PRIDE_ORE, ModItems.GAY_COMB));

        addDrop(ModBlocks.MISTRIUM_ORE, multipleOreDrops(ModBlocks.MISTRIUM_ORE, ModItems.MISTRIUM));

       addDrop(ModBlocks.THUNDER_ORE, multipleOreDrops(ModBlocks.THUNDER_ORE, ModItems.THUNDER));

        addDrop(ModBlocks.PRIDE_BLOCK);
        addDrop(ModBlocks.MISTRIUM_BLOCK);

        addDrop(ModBlocks.CLOUD_BLOCK);
        addDrop(ModBlocks.THUNDER_CLOUD);

        addDrop(ModBlocks.ECHO_BLOCK);
        addDrop(ModBlocks.ECHO_BRICKS);
        addDrop(ModBlocks.ECHO_BRICKS_SlAB);
        addDrop(ModBlocks.ECHO_BRICKS_STAIRS);
        addDrop(ModBlocks.ECHO_BRICKS_WALL);
        addDrop(ModBlocks.ECHO_PILLAR);

        addDrop(ModBlocks.WHITE_OAK_LOG);
        addDrop(ModBlocks.WHITE_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_WHITE_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_WHITE_OAK_WOOD);
        addDrop(ModBlocks.WHITE_OAK_PLANKS);

        addDrop(ModBlocks.PINK_IVORY_LOG);
        addDrop(ModBlocks.PINK_IVORY_WOOD);
        addDrop(ModBlocks.PINK_IVORY_PLANKS);

        addDrop(ModBlocks.PINK_IVORY_STAIRS);
        addDrop(ModBlocks.PINK_IVORY_WALL);
        addDrop(ModBlocks.PINK_IVORY_FENCE_GATE);
        addDrop(ModBlocks.PINK_IVORY_BUTTON);
        addDrop(ModBlocks.PINK_IVORY_PRESSURE_PLATE);

        addDrop(ModBlocks.PINK_IVORY_SlAB, slabDrops(ModBlocks.PINK_IVORY_SlAB));

        addDrop(ModBlocks.WHITE_OAK_LEAVES, leavesDrops(ModBlocks.WHITE_OAK_LEAVES, ModBlocks.WHITE_OAK_LEAVES, 0.005f)); // TODO
    }


    public LootTable.Builder multipleOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}