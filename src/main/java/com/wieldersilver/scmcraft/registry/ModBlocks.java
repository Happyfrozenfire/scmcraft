package com.wieldersilver.scmcraft.registry;

import com.wieldersilver.scmcraft.SCMCraft;
import com.wieldersilver.scmcraft.registry.oreblocks.MythrilOre;
import com.wieldersilver.scmcraft.registry.oreblocks.RubyOre;
import com.wieldersilver.scmcraft.registry.oreblocks.SapphireOre;
import com.wieldersilver.scmcraft.registry.oreblocks.TopazOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(5.0f, 15.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings
            .of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(5.0f, 15.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block TOPAZ_BLOCK = new Block(FabricBlockSettings
            .of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(5.0f, 15.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block MYTHRIL_BLOCK = new MythrilOre(FabricBlockSettings
            .of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(5.0f, 15.0f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block SAPPHIRE_ORE = new SapphireOre(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block TOPAZ_ORE = new TopazOre(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MYTHRIL_ORE = new MythrilOre(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,1)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block RUBY_ORE = new RubyOre(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(3.0f, 6.0f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "mythril_block"), MYTHRIL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "mythril_ore"), MYTHRIL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(SCMCraft.MOD_ID, "ruby_ore"), RUBY_ORE);

    }

}
