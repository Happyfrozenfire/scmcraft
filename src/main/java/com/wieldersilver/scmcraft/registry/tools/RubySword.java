package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class RubySword extends SwordItem {

    public RubySword(ToolMaterial ruby) {
        super(ruby, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
