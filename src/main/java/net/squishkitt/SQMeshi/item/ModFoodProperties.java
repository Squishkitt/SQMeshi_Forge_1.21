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

    public static final FoodProperties GLOW_JELLO = new FoodProperties.Builder().nutrition(5).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 72000),1.0f).alwaysEdible().build();
    public static final FoodProperties BEET_JELLO = new FoodProperties.Builder().nutrition(6).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 18000),1.0f).alwaysEdible().build();
    public static final FoodProperties WARP_JELLO = new FoodProperties.Builder().nutrition(5).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000),1.0f).alwaysEdible().build();
    public static final FoodProperties CRIM_JELLO = new FoodProperties.Builder().nutrition(5).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3),1.0f).alwaysEdible().build();

    public static final FoodProperties BRIOCHE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f)
            .build();

    public static final FoodProperties RAW_EGG = new FoodProperties.Builder().nutrition(3).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1),1.0f)
            .effect(new MobEffectInstance(MobEffects.POISON, 200),0.25f)
            .usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(6).saturationModifier(1.3f)
            .usingConvertsTo(Items.BOWL).build();

    public static final FoodProperties RAW_TURT_EGG = new FoodProperties.Builder().nutrition(3).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1),1.0f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 9600),1.0f)
            .usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties COOKED_TURT_EGG = new FoodProperties.Builder().nutrition(6).saturationModifier(1.3f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 6000),1.0f)
            .usingConvertsTo(Items.BOWL).build();

    public static final FoodProperties RAW_SNIFF_EGG = new FoodProperties.Builder().nutrition(6).saturationModifier(1.3f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 800, 5),1.0f)
            .effect(new MobEffectInstance(MobEffects.WITHER, 800, 1),1.0f)
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 800, 6),1.0f)
            .usingConvertsTo(Items.BOWL).build();
    public static final FoodProperties COOKED_SNIFF_EGG = new FoodProperties.Builder().nutrition(12).saturationModifier(1.9f)
            .usingConvertsTo(Items.BOWL).build();

    public static final FoodProperties CURRY = new FoodProperties.Builder().nutrition(8).saturationModifier(1.0f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 36000),1.0f)
            .usingConvertsTo(Items.BOWL).alwaysEdible().build();

    public static final FoodProperties BEEFSTEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.4f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 1),1.0f)
            .usingConvertsTo(Items.BOWL).alwaysEdible().build();

    public static final FoodProperties HBEEFSTEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 20, 20),1.0f)
            .usingConvertsTo(Items.BOWL).alwaysEdible().build();

}
