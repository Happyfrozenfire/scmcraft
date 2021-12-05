package com.wieldersilver.scmcraft.registry.tools.weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KeybladeItem extends SwordItem {
    public KeybladeItem(ToolMaterial material) {
        super(material, 2, -2.2f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}

