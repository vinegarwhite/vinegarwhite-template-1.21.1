package com.vinegarwhite.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.vinegarwhite.attribute.MedicineEntityAttributes;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class MedicineCommand {

    // 注册命令的方法
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("medicine")
                    .then(CommandManager.literal("mental")
                            // 添加 "get" 子命令，用于获取精神状态
                            .then(CommandManager.literal("get")
                                    .executes(context -> {
                                        ServerCommandSource source = context.getSource();
                                        PlayerEntity player = source.getPlayer();

                                        if (player != null) {
                                            // 获取玩家的 "mental_state" 属性
                                            EntityAttributeInstance mentalState = player.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE);

                                            // 检查属性是否存在
                                            if (mentalState != null) {
                                                double mentalStateValue = mentalState.getValue();
                                                // 输出玩家的精神状态属性值到聊天窗口
                                                source.sendFeedback(() -> Text.literal("精神状态: " + mentalStateValue), false);
                                            } else {
                                                // 属性未找到，输出错误消息
                                                source.sendFeedback(() -> Text.literal("精神状态不存在"), false);
                                            }
                                        } else {
                                            source.sendFeedback(() -> Text.literal("玩家不存在"), false);
                                        }
                                        return Command.SINGLE_SUCCESS;
                                    })
                            )
                            // 添加 "set" 子命令，用于设置精神状态，接受一个 double 类型的参数
                            .then(CommandManager.literal("set")
                                    .requires(source -> source.hasPermissionLevel(2)) // 设置权限等级为2，只有OP可以使用
                                    .then(CommandManager.argument("value", DoubleArgumentType.doubleArg(-10000.0, 10000.0))
                                            .executes(context -> {
                                                ServerCommandSource source = context.getSource();
                                                PlayerEntity player = source.getPlayer();
                                                double newValue = DoubleArgumentType.getDouble(context, "value");

                                                if (player != null) {
                                                    // 获取玩家的 "mental_state" 属性
                                                    EntityAttributeInstance mentalState = player.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE);

                                                    // 检查属性是否存在
                                                    if (mentalState != null) {
                                                        // 设置新的精神状态值
                                                        mentalState.setBaseValue(newValue);
                                                        // 输出设置成功的信息
                                                        source.sendFeedback(() -> Text.literal("精神状态已设置为: " + newValue), false);
                                                    } else {
                                                        // 属性未找到，输出错误消息
                                                        source.sendFeedback(() -> Text.literal("精神状态不存在"), false);
                                                    }
                                                } else {
                                                    source.sendFeedback(() -> Text.literal("玩家不存在"), false);
                                                }
                                                return Command.SINGLE_SUCCESS;
                                            })
                                    )
                            )
                    )
            );
        });
    }


}
