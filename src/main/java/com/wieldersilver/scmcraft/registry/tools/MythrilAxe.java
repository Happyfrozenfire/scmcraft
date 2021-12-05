package com.wieldersilver.scmcraft.registry.tools;

import net.minecraft.item.*;

public class MythrilAxe extends AxeItem {

    public MythrilAxe(ToolMaterial mythril) {
        super(mythril, 6, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}


