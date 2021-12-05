package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class TopazHoe extends HoeItem {

    public TopazHoe(ToolMaterial topaz) {
        super(topaz, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
