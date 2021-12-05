package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class MythrilHoe extends HoeItem {

    public MythrilHoe(ToolMaterial ruby) {
        super(ruby, 0, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
