package com.vinegarwhite.item.custom.pills;

import com.vinegarwhite.attribute.MedicineEntityAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DeltaPill extends Item {

    public DeltaPill(Settings settings) {
        super(settings);
    }


    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // 先执行父类的finishUsing
        ItemStack itemStack = super.finishUsing(stack, world, user);

        // 处于服务端的情况下
        if(!world.isClient){
            // 物品使用者是玩家的情况下
            if (user instanceof PlayerEntity playerEntity){
                // 设置冷却时间为10000 ticks
                playerEntity.getItemCooldownManager().set(this, 10000);

                // 检查玩家是否有mental_state属性
                if (playerEntity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE) != null) {
                    // 获取当前的mental_state值
                    double currentMentalState = playerEntity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE).getBaseValue();

                    // 增加100精神状态
                    playerEntity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE).setBaseValue(currentMentalState + 100.0);
                }
            }
        }

        return super.finishUsing(stack, world, user);
    }
}
