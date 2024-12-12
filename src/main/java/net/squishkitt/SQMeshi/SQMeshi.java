package net.squishkitt.SQMeshi;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.squishkitt.SQMeshi.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SQMeshi.MOD_ID)
public class SQMeshi {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sqmeshimod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SQMeshi() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.FUSEBUD);
            event.accept(ModItems.MARROW);
            event.accept(ModItems.BAPPLE);
            event.accept(ModItems.CAPPLE);
            event.accept(ModItems.CARCOOKIE);
            event.accept(ModItems.SCARAMEL);

            event.accept(ModItems.SC_PORK);
            event.accept(ModItems.SC_LAMB);
            event.accept(ModItems.SC_BEEF);

            event.accept(ModItems.GLOW_JELLO);
            event.accept(ModItems.BEET_JELLO);
            event.accept(ModItems.WARP_JELLO);
            event.accept(ModItems.CRIM_JELLO);

            event.accept(ModItems.BRIOCHE);

            event.accept(ModItems.RAW_EGG);
            event.accept(ModItems.COOKED_EGG);

            event.accept(ModItems.RAW_TURT_EGG);
            event.accept(ModItems.COOKED_TURT_EGG);

            event.accept(ModItems.RAW_SNIFF_EGG);
            event.accept(ModItems.COOKED_SNIFF_EGG);

            event.accept(ModItems.CURRY);
            event.accept(ModItems.BEEFSTEW);
            event.accept(ModItems.HBEEFSTEW);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CARAMEL);
            event.accept(ModItems.SALT);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
