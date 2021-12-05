package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class EmeraldSword extends SwordItem {

    public EmeraldSword(ToolMaterial emerald) {
        super(emerald, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
