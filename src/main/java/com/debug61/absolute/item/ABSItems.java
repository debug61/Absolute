package com.debug61.absolute.item;

import com.debug61.absolute.Absolute;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ABSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Absolute.MOD_ID);

    public static final RegistryObject<Item> ABSOLUTE_DUST = ITEMS.register("abs_dust",
            () -> new Item(new Item.Properties().tab(ABSTab.ABSOLUTE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
