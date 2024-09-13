package com.vinegarwhite.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 0.5f).build();

    // 药绝药物
    public static final FoodComponent ALPHA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent BETA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent GAMMA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent DELTA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();

}
