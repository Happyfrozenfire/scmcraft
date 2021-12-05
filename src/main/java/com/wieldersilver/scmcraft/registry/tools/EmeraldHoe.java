package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class EmeraldHoe extends HoeItem {

    public EmeraldHoe(ToolMaterial emerald) {
        super(emerald, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
