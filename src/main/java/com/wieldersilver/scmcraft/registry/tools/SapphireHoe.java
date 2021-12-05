package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class SapphireHoe extends HoeItem {

    public SapphireHoe(ToolMaterial sapphire) {
        super(sapphire, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
