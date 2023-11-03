package net.flippycereal.dreamcraftmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.flippycereal.dreamcraftmod.DreamCraft;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PRIDE_ORE = registerBlock("pride_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));

    public static final Block PRIDE_BLOCK = registerBlock("pride_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    public static final Block WHITE_OAK_LOG = registerBlock("white_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block WHITE_OAK_WOOD = registerBlock("white_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block WHITE_OAK_PLANKS = registerBlock("white_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block WHITE_OAK_LEAVES = registerBlock("white_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));


    public static final Block PINK_IVORY_LOG = registerBlock("pink_ivory_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block PINK_IVORY_WOOD = registerBlock("pink_ivory_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));

    public static final Block PINK_IVORY_PLANKS = registerBlock("pink_ivory_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));


    public static final Block PINK_IVORY_STAIRS = registerBlock("pink_ivory_stairs",
            new StairsBlock(ModBlocks.PINK_IVORY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
        public static final Block PINK_IVORY_SlAB = registerBlock("pink_ivory_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block PINK_IVORY_BUTTON = registerBlock("pink_ivory_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), BlockSetType.SPRUCE, 10, true));
    public static final Block PINK_IVORY_PRESSURE_PLATE = registerBlock("pink_ivory_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), BlockSetType.SPRUCE));

    public static final Block PINK_IVORY_FENCE = registerBlock("pink_ivory_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block PINK_IVORY_FENCE_GATE = registerBlock("pink_ivory_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), WoodType.SPRUCE));
    public static final Block PINK_IVORY_WALL = registerBlock("pink_ivory_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block PINK_IVORY_DOOR = registerBlock("pink_ivory_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).strength(4f), BlockSetType.SPRUCE));
    public static final Block PINK_IVORY_TRAPDOOR = registerBlock("pink_ivory_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).strength(4f), BlockSetType.SPRUCE));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DreamCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
       return Registry.register(Registries.ITEM, new Identifier(DreamCraft.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
    }
}
