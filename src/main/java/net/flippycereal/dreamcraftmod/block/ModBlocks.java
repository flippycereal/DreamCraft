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

    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).strength(10)));

    public static final Block PRIDE_ORE = registerBlock("pride_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block PRIDE_BLOCK = registerBlock("pride_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CLOUD_BLOCK = registerBlock("cloud_block",
            new CloudBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).slipperiness(0.98f).breakInstantly().notSolid()));
    public static final Block THUNDER_CLOUD = registerBlock("thunder_cloud",
            new CloudBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).slipperiness(0.98f).breakInstantly().notSolid()));
    public static final Block MISTRIUM_ORE = registerBlock("mistrium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(7, 14)));
    public static final Block THUNDER_ORE = registerBlock("thunder_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(7, 14)));
    public static final Block MISTRIUM_BLOCK = registerBlock("mistrium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block ECHO_BRICKS = registerBlock("echo_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).strength(50.0f, 120)));
    public static final Block ECHO_BRICKS_STAIRS = registerBlock("echo_bricks_stairs",
            new StairsBlock(ModBlocks.ECHO_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).strength(50.0f, 120)));
    public static final Block ECHO_BRICKS_SlAB = registerBlock("echo_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).strength(50.0f, 120)));
    public static final Block ECHO_BRICKS_WALL = registerBlock("echo_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).strength(50.0f, 120)));

    public static final Block ECHO_PILLAR = registerBlock("echo_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR).sounds(BlockSoundGroup.SCULK_CATALYST).strength(50.0f, 120)));


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
    public static final Block WHITE_OAK_STAIRS = registerBlock("white_oak_stairs",
            new StairsBlock(ModBlocks.WHITE_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).strength(4f)));
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

    public static final Block PINK_IVORY_FENCE_GATE = registerBlock("pink_ivory_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), WoodType.SPRUCE));
    public static final Block PINK_IVORY_WALL = registerBlock("pink_ivory_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));


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
