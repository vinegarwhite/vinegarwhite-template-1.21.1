package com.vinegarwhite.item.custom.food;

import com.vinegarwhite.attribute.MedicineEntityAttributes;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class Salad extends Item {

    public Salad(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
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
                    playerEntity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE).setBaseValue(currentMentalState + 10.0);
                }
            }
        }

        return super.finishUsing(stack, world, user);
    }

    // 物品的描述信息
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("item.salad.shift_tooltip"));
        } else {
            tooltip.add(Text.translatable("item.salad.tooltip"));
        }
    }
}
