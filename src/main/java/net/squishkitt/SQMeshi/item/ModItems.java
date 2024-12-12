package net.squishkitt.SQMeshi.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.squishkitt.SQMeshi.SQMeshi;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SQMeshi.MOD_ID);

    public static final RegistryObject<Item> FUSEBUD = ITEMS.register("fusebud",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FUSEBUD)));
    public static final RegistryObject<Item> MARROW = ITEMS.register("marrow",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MARROW)));
    public static final RegistryObject<Item> BAPPLE = ITEMS.register("bapple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAPPLE)));
    public static final RegistryObject<Item> CAPPLE = ITEMS.register("capple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAPPLE)));
    public static final RegistryObject<Item> CARCOOKIE = ITEMS.register("carcookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CARCOOKIE)));
    public static final RegistryObject<Item> SCARAMEL = ITEMS.register("scaramel",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SCARAMEL)));

    public static final RegistryObject<Item> SC_PORK = ITEMS.register("sc_pork",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SC_PORK)));
    public static final RegistryObject<Item> SC_LAMB = ITEMS.register("sc_lamb",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SC_LAMB)));
    public static final RegistryObject<Item> SC_BEEF = ITEMS.register("sc_beef",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SC_BEEF)));

    public static final RegistryObject<Item> GLOW_JELLO = ITEMS.register("glow_jello",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOW_JELLO).stacksTo(1)));
    public static final RegistryObject<Item> BEET_JELLO = ITEMS.register("beet_jello",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEET_JELLO).stacksTo(1)));
    public static final RegistryObject<Item> WARP_JELLO = ITEMS.register("warp_jello",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WARP_JELLO).rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> CRIM_JELLO = ITEMS.register("crim_jello",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRIM_JELLO).rarity(Rarity.RARE).stacksTo(1)));

    public static final RegistryObject<Item> BRIOCHE = ITEMS.register("brioche",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRIOCHE)));

    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_EGG = ITEMS.register("raw_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_EGG).craftRemainder(Items.BOWL).stacksTo(1)));
    public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_EGG).craftRemainder(Items.BOWL).stacksTo(1)));

    public static final RegistryObject<Item> RAW_TURT_EGG = ITEMS.register("raw_turt_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_TURT_EGG).craftRemainder(Items.BOWL).stacksTo(1)));
    public static final RegistryObject<Item> COOKED_TURT_EGG = ITEMS.register("cooked_turt_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_TURT_EGG).craftRemainder(Items.BOWL).stacksTo(1)));

    public static final RegistryObject<Item> RAW_SNIFF_EGG = ITEMS.register("raw_sniff_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_SNIFF_EGG).craftRemainder(Items.BOWL).stacksTo(1)));
    public static final RegistryObject<Item> COOKED_SNIFF_EGG = ITEMS.register("cooked_sniff_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SNIFF_EGG).craftRemainder(Items.BOWL).stacksTo(1)));

    public static final RegistryObject<Item> CURRY = ITEMS.register("curry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CURRY).craftRemainder(Items.BOWL).stacksTo(1)));

    public static final RegistryObject<Item> BEEFSTEW = ITEMS.register("beefstew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEEFSTEW).craftRemainder(Items.BOWL).stacksTo(1)));
    public static final RegistryObject<Item> HBEEFSTEW = ITEMS.register("hbeefstew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HBEEFSTEW).craftRemainder(Items.BOWL).stacksTo(1)));

    public static final RegistryObject<Item> SFISHEGG = ITEMS.register("sfishegg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SFISHEGG)));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANDY).stacksTo(16)));

    public static final RegistryObject<Item> ROAST_PUMPKIN = ITEMS.register("roast_pumpkin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROAST_PUMPKIN).stacksTo(16)));
    public static final RegistryObject<Item> STUFFED_PUMPKIN = ITEMS.register("stuffed_pumpkin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STUFFED_PUMPKIN).stacksTo(16)));

    public static final RegistryObject<Item> EYE = ITEMS.register("eye",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EYE)));
    public static final RegistryObject<Item> COOKED_EYE = ITEMS.register("cooked_eye",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_EYE)));
    public static final RegistryObject<Item> COOKED_SPIDER_EYE = ITEMS.register("cooked_spider_eye",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SPIDER_EYE)));

    public static final RegistryObject<Item> SLIME_SKEWER = ITEMS.register("slime_skewer",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SLIME_SKEWER)));
    public static final RegistryObject<Item> END_SKEWER = ITEMS.register("end_skewer",
            () -> new Item(new Item.Properties().food(ModFoodProperties.END_SKEWER)));
    public static final RegistryObject<Item> NETH_SKEWER = ITEMS.register("neth_skewer",
            () -> new Item(new Item.Properties().food(ModFoodProperties.NETH_SKEWER)));

    public static final RegistryObject<Item> SLIME_SKEWER_COOKED = ITEMS.register("slime_skewer_cooked",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SLIME_SKEWER_COOKED)));
    public static final RegistryObject<Item> END_SKEWER_COOKED = ITEMS.register("end_skewer_cooked",
            () -> new Item(new Item.Properties().food(ModFoodProperties.END_SKEWER_COOKED)));
    public static final RegistryObject<Item> NETH_SKEWER_COOKED = ITEMS.register("neth_skewer_cooked",
            () -> new Item(new Item.Properties().food(ModFoodProperties.NETH_SKEWER_COOKED)));

    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HEART_COOKED = ITEMS.register("heart_cooked",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HEART_COOKED).stacksTo(1).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
