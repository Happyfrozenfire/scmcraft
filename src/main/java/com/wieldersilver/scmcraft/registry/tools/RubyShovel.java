package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class RubyShovel extends ShovelItem {

    public RubyShovel(ToolMaterial ruby) {
        super(ruby, 1.5f, -3.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
