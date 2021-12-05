package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(ToolMaterial ruby) {
        super(ruby, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
