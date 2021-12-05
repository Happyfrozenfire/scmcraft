package com.wieldersilver.scmcraft.registry.tools;


import net.minecraft.item.*;

public class SapphireShovel extends ShovelItem {

    public SapphireShovel(ToolMaterial sapphire) {
        super(sapphire, 1.5f, -3.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
