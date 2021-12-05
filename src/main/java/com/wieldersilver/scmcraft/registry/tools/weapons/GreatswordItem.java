package com.wieldersilver.scmcraft.registry.tools.weapons;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Hand;

public class GreatswordItem extends SwordItem {


    public GreatswordItem(ToolMaterial material) {
        super(material, 6, -3.5f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}

