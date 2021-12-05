package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class AmethystHoe extends HoeItem {

    public AmethystHoe(ToolMaterial amethyst) {
        super(amethyst, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
