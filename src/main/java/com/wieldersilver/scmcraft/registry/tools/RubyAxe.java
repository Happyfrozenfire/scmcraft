package com.wieldersilver.scmcraft.registry.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;

public class RubyAxe extends AxeItem {

        public RubyAxe(ToolMaterial ruby) {
            super(ruby, 6, -3.3f, new Item.Settings().group(ItemGroup.TOOLS));
        }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.setOnFireFor(100000);

        return true;
    }
    }


