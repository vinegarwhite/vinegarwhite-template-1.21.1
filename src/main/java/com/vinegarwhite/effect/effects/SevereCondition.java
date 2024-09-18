package com.vinegarwhite.effect.effects;

import com.vinegarwhite.attribute.MedicineEntityAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class SevereCondition extends StatusEffect {
    public SevereCondition(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            // 检查实体是否是玩家，并确保其有该属性
            if (entity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE) != null) {
                // 每秒游戏有 20 个 tick，因此我们可以每 100 个 tick 扣除一次状态
                if (entity.getWorld().getTime() % 100 == 0) {
                    // 扣除一定的 mental_state 值
                    entity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE)
                            .setBaseValue(entity.getAttributeInstance(MedicineEntityAttributes.GENERIC_MENTAL_STATE)
                                    .getBaseValue() - 1.0); // 每秒减少 1.0，调整这个值来控制减少的幅度
                }
            }
        }
        return super.applyUpdateEffect(entity, amplifier);
    }

    // 控制每 tick 是否应用效果，这里返回 true 表示每 tick 都检查
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
