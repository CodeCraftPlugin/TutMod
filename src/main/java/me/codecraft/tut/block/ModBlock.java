package me.codecraft.tut.block;

import me.codecraft.tut.TutMod;
import me.codecraft.tut.block.advance.BecomeAGod;
import me.codecraft.tut.block.advance.PepperPlantBlock;
import me.codecraft.tut.item.ItemGroupMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    //RegisteredBlock
    // ores
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).
                    strength(8.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    //Blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block SYSTEM = registerBlock("system",
            new BecomeAGod(FabricBlockSettings.of(Material.SOIL).
                    strength(4.0f).breakByTool(FabricToolTags.SHOVELS,2).breakByHand(true)));

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new ModStairsBlock(ModBlock.RUBY_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ModButton(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new ModPressuresPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));

    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new Door(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().nonOpaque()));

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new Trapdoor(FabricBlockSettings.of(Material.STONE).
                    strength(4.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().nonOpaque()));

    public static final Block PEPPER_PLANT = registerCropBlock("pepper_plant",
            new PepperPlantBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    // Methods
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(TutMod.mod_id,name),block);
    }
    private static Block registerCropBlock(String name,Block block){
        return Registry.register(Registry.BLOCK, new Identifier(TutMod.mod_id,name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(TutMod.mod_id,name),
                new BlockItem(block,new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    }
    public static void registerModBlock(){
        System.out.println("the block is register "+ TutMod.mod_id);
    }
}
