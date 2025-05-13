package com.debug61.absolute;

import com.debug61.absolute.common.registry.ModBlocks;
import com.debug61.absolute.common.registry.ModContainers;
import com.debug61.absolute.common.registry.ModItems;
import com.debug61.absolute.common.registry.ModTileEntities;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Absolute.MOD_ID)
public class Absolute {
    public static final String MOD_ID = "abs";

    public Absolute() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTileEntities.TILE_ENTITIES.register(modEventBus);
        ModContainers.CONTAINERS.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent commonSetupEvent) {

    }
}
