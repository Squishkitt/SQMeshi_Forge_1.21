package net.squishkitt.SQMeshi.item;

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
