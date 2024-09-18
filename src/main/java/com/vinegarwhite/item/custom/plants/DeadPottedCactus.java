package com.vinegarwhite.item.custom.plants;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;

public class DeadPottedCactus extends Item implements Equipment {


    public DeadPottedCactus(Settings settings) {
        super(settings);
    }

    // 实现可以戴到头上
    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }


}
