package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class MythrilShovel extends ShovelItem {

    public MythrilShovel(ToolMaterial mythril) {
        super(mythril, 1.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
