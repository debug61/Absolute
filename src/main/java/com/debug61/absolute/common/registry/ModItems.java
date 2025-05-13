package com.debug61.absolute.common.registry;

import com.debug61.absolute.Absolute;
import com.debug61.absolute.common.item.LighterItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Absolute.MOD_ID);
    public static final Item.Properties BLOCK_TAB = new Item.Properties().tab(ModCreativeTab.ABSOLUTE_TAB);

    public static final RegistryObject<Item> ABSOLUTE_DUST = ITEMS.register("abs_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.ABSOLUTE_TAB)));

    public static final RegistryObject<Item> ABSOLUTE_INGOT = ITEMS.register("abs_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.ABSOLUTE_TAB)));

    public static final RegistryObject<LighterItem> LIGHTER = ITEMS.register("lighter",
            () -> new LighterItem(new Item.Properties().durability(128).tab(ModCreativeTab.ABSOLUTE_TAB)));
}
