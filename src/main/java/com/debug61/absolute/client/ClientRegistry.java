package com.debug61.absolute.client;


import com.debug61.absolute.Absolute;
import com.debug61.absolute.client.gui.screen.GeneratorScreen;
import com.debug61.absolute.common.registry.ModContainers;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod.EventBusSubscriber(modid = Absolute.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegistry {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        ScreenManager.register(ModContainers.GENERATOR_CONTAINER.get(), GeneratorScreen::new);
    }

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<ContainerType<?>> event) {
        // Containers registry
    }

    @SubscribeEvent
    public static void loadComplete(FMLLoadCompleteEvent loadCompleteEvent) {
        // On load completion
    }
}
