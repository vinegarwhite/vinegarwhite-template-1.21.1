package com.vinegarwhite.hud;

import com.vinegarwhite.attribute.MedicineEntityAttributes;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerEntity;

import java.text.DecimalFormat;

public class MedicineHudRenderer {

    // 用于保留两位小数
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public static void renderCustomValue(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();

        if (client.player != null) {
            // 获取 TextRenderer 实例
            TextRenderer textRenderer = client.textRenderer;

            // 获取精神状态数值，并格式化为保留两位小数
            double mentalStateValue = getMentalStateValue(client.player);
            String valueToRender = "精神状态: " + decimalFormat.format(mentalStateValue);

            // 获取屏幕的宽度和文本的宽度
            int screenWidth = client.getWindow().getScaledWidth();
            int textWidth = textRenderer.getWidth(valueToRender);

            // 计算居中的X坐标
            int x = (screenWidth - textWidth) / 2;
            int y = 5; // Y 坐标，可以根据需要调整

            // 使用 DrawContext 渲染带阴影的文本
            context.drawTextWithShadow(textRenderer, valueToRender, x, y, 0xFFFFFF);
        }
    }

    // 获取精神状态的方法
    private static double getMentalStateValue(PlayerEntity player) {
        // 这里返回精神状态的数值，可以根据你的需求从属性中获取
        if (player.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE) != null) {
            return player.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE).getBaseValue();
        }
        return 0.0;
    }
}
