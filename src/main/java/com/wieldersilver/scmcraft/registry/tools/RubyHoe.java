package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class RubyHoe extends HoeItem {

    public RubyHoe(ToolMaterial ruby) {
        super(ruby, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
