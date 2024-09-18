package com.vinegarwhite.item.custom.food;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class Salad extends Item {

    public Salad(Settings settings) {
        super(settings);
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
