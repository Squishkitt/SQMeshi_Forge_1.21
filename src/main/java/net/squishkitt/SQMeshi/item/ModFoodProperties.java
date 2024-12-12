package net.squishkitt.SQMeshi.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {

    public static final FoodProperties FUSEBUD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200),1.0f).fast().alwaysEdible().build();
    public static final FoodProperties MARROW = new FoodProperties.Builder().nutrition(2).saturationModifier(0.6f)
            .build();
    public static final FoodProperties BAPPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8f)
            .build();
    public static final FoodProperties CARCOOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.35f)
            .build();
    public static final FoodProperties CAPPLE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1800, 2),1.0f).alwaysEdible().usingConvertsTo(Items.STICK).build();
    public static final FoodProperties SCARAMEL = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4),1.0f).alwaysEdible().build();

    public static final FoodProperties SC_PORK = new FoodProperties.Builder().nutrition(4).saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 150, 2),1.0f).alwaysEdible().build();

    public static final FoodProperties SC_LAMB = new FoodProperties.Builder().nutrition(3).saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 450, 1),1.0f).alwaysEdible().build();

    public static final FoodProperties SC_BEEF = new FoodProperties.Builder().nutrition(4).saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 900),1.0f).alwaysEdible().build();

}
