package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class EmeraldShovel extends ShovelItem {

    public EmeraldShovel(ToolMaterial emerald) {
        super(emerald, 1.5f, -3.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
