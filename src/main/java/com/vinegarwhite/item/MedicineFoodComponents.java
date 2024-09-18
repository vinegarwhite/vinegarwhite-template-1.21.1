package com.vinegarwhite.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class MedicineFoodComponents {

    // 药物
    public static final FoodComponent ALPHA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent BETA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent GAMMA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent DELTA_PILL = new FoodComponent.Builder().snack().alwaysEdible().nutrition(1).saturationModifier(0f).build();

    // 食物
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent SALAD = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().nutrition(9).saturationModifier(1.2f).build();
    public static final FoodComponent COLA = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent KAISER_ROLL = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();

    // 鱼类
    public static final FoodComponent STRANGE_VIAL = new FoodComponent.Builder().alwaysEdible().nutrition(2).saturationModifier(5.0f).build();
    public static final FoodComponent KING_FISH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent COOKED_KING_FISH = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(0.4f).build();
    public static final FoodComponent GOLDEN_FISH = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
            .alwaysEdible()
            .build();
}

