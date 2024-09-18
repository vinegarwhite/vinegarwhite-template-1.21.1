package com.vinegarwhite.item.custom.pills;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GammaPill extends Item {

    public GammaPill(Settings settings) {
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
                // 设置冷却时间为20 ticks
                playerEntity.getItemCooldownManager().set(this, 20);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}
