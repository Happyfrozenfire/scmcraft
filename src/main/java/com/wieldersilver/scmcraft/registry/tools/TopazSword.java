package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class TopazSword extends SwordItem {

    public TopazSword(ToolMaterial topaz) {
        super(topaz, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
