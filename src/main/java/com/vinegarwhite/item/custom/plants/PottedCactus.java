package com.vinegarwhite.item.custom.plants;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PottedCactus extends Item implements Equipment {


    public PottedCactus(Settings settings) {
        super(settings);
    }

    // 实现可以戴到头上
    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }


}
