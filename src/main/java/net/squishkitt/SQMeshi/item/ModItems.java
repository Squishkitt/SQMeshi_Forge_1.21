package net.squishkitt.SQMeshi.item;

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
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARCOOKIE = ITEMS.register("carcookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CARCOOKIE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
