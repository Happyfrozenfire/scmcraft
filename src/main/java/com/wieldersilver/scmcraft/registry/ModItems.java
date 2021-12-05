package com.wieldersilver.scmcraft.registry;

import com.wieldersilver.scmcraft.*;
import com.wieldersilver.scmcraft.registry.armor.*;
import com.wieldersilver.scmcraft.registry.tools.*;
import com.wieldersilver.scmcraft.registry.tools.toolmaterials.*;
import com.wieldersilver.scmcraft.registry.tools.weapons.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TOPAZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item MYTHRIL_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item KINGDOM_KEY_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item KINGDOM_KEY_BLADE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item KINGDOM_KEY_POINT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item KINGDOM_KEY_D_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item KINGDOM_KEY_D_BLADE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item KINGDOM_KEY_D_POINT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item LADY_LUCK_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LADY_LUCK_BLADE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LADY_LUCK_POINT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final KeybladeItem KINGDOM_KEY = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem KINGDOM_KEY_D = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem LADY_LUCK = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem SOUL_EATER = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem CRAB_CLAW = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem METAL_CHOCOBO = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem OATHKEEPER = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem DIVINE_ROSE = new KeybladeItem(new ToolMaterialKeybladeOne());
    public static final KeybladeItem DIAMOND_DUST = new KeybladeItem(new ToolMaterialKeybladeOne());


    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TOPAZ_BLOCK = new BlockItem(ModBlocks.TOPAZ_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(ModBlocks.SAPPHIRE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MYTHRIL_BLOCK = new BlockItem(ModBlocks.MYTHRIL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Ore Block Items
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TOPAZ_ORE = new BlockItem(ModBlocks.TOPAZ_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SAPPHIRE_ORE = new BlockItem(ModBlocks.SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MYTHRIL_ORE = new BlockItem(ModBlocks.MYTHRIL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Armor
    public static final ArmorMaterial RUBY_ARMOR = new RubyArmorMaterial();
    public static final ArmorMaterial SAPPHIRE_ARMOR = new SapphireArmorMaterial();
    public static final ArmorMaterial TOPAZ_ARMOR = new TopazArmorMaterial();
    public static final ArmorMaterial MYTHRIL_ARMOR = new MythrilArmorMaterial();
    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();
    public static final ArmorMaterial AMETHYST_ARMOR = new AmethystArmorMaterial();

    //Weapons
    public static final GreatswordItem RUBY_GREATSWORD = new GreatswordItem(new ToolMaterialRuby());
    public static final GreatswordItem AMETHYST_GREATSWORD = new GreatswordItem(new ToolMaterialAmethyst());
    public static final GreatswordItem SAPPHIRE_GREATSWORD = new GreatswordItem(new ToolMaterialSapphire());
    public static final GreatswordItem EMERALD_GREATSWORD = new GreatswordItem(new ToolMaterialEmerald());
    public static final GreatswordItem TOPAZ_GREATSWORD = new GreatswordItem(new ToolMaterialTopaz());
    public static final GreatswordItem MYTHRIL_GREATSWORD = new GreatswordItem(new ToolMaterialMythril());
    public static final GreatswordItem WOODEN_GREATSWORD = new GreatswordItem(ToolMaterials.WOOD);
    public static final GreatswordItem STONE_GREATSWORD = new GreatswordItem(ToolMaterials.STONE);
    public static final GreatswordItem IRON_GREATSWORD = new GreatswordItem(ToolMaterials.IRON);
    public static final GreatswordItem GOLD_GREATSWORD = new GreatswordItem(ToolMaterials.GOLD);
    public static final GreatswordItem DIAMOND_GREATSWORD = new GreatswordItem(ToolMaterials.DIAMOND);
    public static final GreatswordItem NETHERITE_GREATSWORD = new GreatswordItem(ToolMaterials.NETHERITE);

    public static final RapierItem RUBY_RAPIER = new RapierItem(new ToolMaterialRuby());
    public static final RapierItem AMETHYST_RAPIER = new RapierItem(new ToolMaterialAmethyst());
    public static final RapierItem SAPPHIRE_RAPIER = new RapierItem(new ToolMaterialSapphire());
    public static final RapierItem EMERALD_RAPIER = new RapierItem(new ToolMaterialEmerald());
    public static final RapierItem TOPAZ_RAPIER = new RapierItem(new ToolMaterialTopaz());
    public static final RapierItem MYTHRIL_RAPIER = new RapierItem(new ToolMaterialMythril());
    public static final RapierItem WOODEN_RAPIER = new RapierItem(ToolMaterials.WOOD);
    public static final RapierItem STONE_RAPIER = new RapierItem(ToolMaterials.STONE);
    public static final RapierItem IRON_RAPIER = new RapierItem(ToolMaterials.IRON);
    public static final RapierItem GOLD_RAPIER = new RapierItem(ToolMaterials.GOLD);
    public static final RapierItem DIAMOND_RAPIER = new RapierItem(ToolMaterials.DIAMOND);
    public static final RapierItem NETHERITE_RAPIER = new RapierItem(ToolMaterials.NETHERITE);





    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_shard"), MYTHRIL_SHARD);

        //Blocks
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_block"), MYTHRIL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_ore"), MYTHRIL_ORE);

        //tools
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_greatsword"), new GreatswordItem(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_greatsword"), new GreatswordItem(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_greatsword"), new GreatswordItem(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_greatsword"), new GreatswordItem(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_greatsword"), new GreatswordItem(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_greatsword"), new GreatswordItem(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "wooden_greatsword"), new GreatswordItem(ToolMaterials.WOOD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "stone_greatsword"), new GreatswordItem(ToolMaterials.STONE));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "iron_greatsword"), new GreatswordItem(ToolMaterials.IRON));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "gold_greatsword"), new GreatswordItem(ToolMaterials.GOLD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "diamond_greatsword"), new GreatswordItem(ToolMaterials.DIAMOND));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "netherite_greatsword"), new GreatswordItem(ToolMaterials.NETHERITE));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_rapier"), new RapierItem(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_rapier"), new RapierItem(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_rapier"), new RapierItem(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_rapier"), new RapierItem(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_rapier"), new RapierItem(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_rapier"), new RapierItem(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "wooden_rapier"), new GreatswordItem(ToolMaterials.WOOD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "stone_rapier"),new GreatswordItem(ToolMaterials.STONE));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "iron_rapier"), new GreatswordItem(ToolMaterials.IRON));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "gold_rapier"), new GreatswordItem(ToolMaterials.GOLD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "diamond_rapier"), new GreatswordItem(ToolMaterials.DIAMOND));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "netherite_rapier"), new GreatswordItem(ToolMaterials.NETHERITE));


        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_pickaxe"), new RubyPickaxe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_axe"), new RubyAxe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_hoe"), new RubyHoe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_shovel"), new RubyShovel(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_sword"), new RubySword(new ToolMaterialRuby()));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_pickaxe"), new SapphirePickaxe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_axe"), new SapphireAxe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_hoe"), new SapphireHoe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_shovel"), new SapphireShovel(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_sword"), new SapphireSword(new ToolMaterialSapphire()));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_pickaxe"), new TopazPickaxe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_axe"), new TopazAxe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_hoe"), new TopazHoe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_shovel"), new TopazShovel(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_sword"), new TopazSword(new ToolMaterialTopaz()));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_pickaxe"), new AmethystPickaxe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_axe"), new AmethystAxe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_hoe"), new AmethystHoe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_shovel"), new AmethystShovel(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_sword"), new AmethystSword(new ToolMaterialAmethyst()));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_pickaxe"), new EmeraldPickaxe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_axe"), new EmeraldAxe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_hoe"), new EmeraldHoe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_shovel"), new EmeraldShovel(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_sword"), new EmeraldSword(new ToolMaterialEmerald()));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_pickaxe"), new MythrilPickaxe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_axe"), new MythrilAxe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_hoe"), new MythrilHoe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_shovel"), new MythrilShovel(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_sword"), new MythrilSword(new ToolMaterialMythril()));

        //Armor
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_helmet"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_chestplate"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_leggings"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "ruby_boots"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_helmet"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_chestplate"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_leggings"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "sapphire_boots"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_helmet"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_chestplate"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_leggings"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "topaz_boots"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_helmet"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_chestplate"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_leggings"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "amethyst_boots"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_helmet"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_chestplate"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_leggings"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "emerald_boots"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.FEET));


        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_helmet"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_chestplate"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_leggings"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "mythril_boots"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_hilt"), KINGDOM_KEY_HILT);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_blade"), KINGDOM_KEY_BLADE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_point"), KINGDOM_KEY_POINT);

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_d_hilt"), KINGDOM_KEY_D_HILT);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_d_blade"), KINGDOM_KEY_D_BLADE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_d_point"), KINGDOM_KEY_D_POINT);

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "lady_luck_hilt"), LADY_LUCK_HILT);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "lady_luck_blade"), LADY_LUCK_BLADE);
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "lady_luck_point"), LADY_LUCK_POINT);

        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "kingdom_key_d"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "lady_luck"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "soul_eater"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "crab_claw"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "metal_chocobo"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "oathkeeper"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "divine_rose"), new KeybladeItem(new ToolMaterialKeybladeOne()));
        Registry.register(Registry.ITEM, new Identifier(SCMCraft.MOD_ID, "diamond_dust"), new KeybladeItem(new ToolMaterialKeybladeOne()));


    }
}
