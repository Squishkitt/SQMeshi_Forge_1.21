package net.squishkitt.SQMeshi.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties FUSEBUD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200),1.0f).fast().alwaysEdible().build();
    public static final FoodProperties MARROW = new FoodProperties.Builder().nutrition(2).saturationModifier(0.6f)
            .build();
}
