package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class MythrilSword extends SwordItem {

    public MythrilSword(ToolMaterial mythril) {
        super(mythril, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
