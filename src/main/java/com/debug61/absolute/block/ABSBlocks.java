package com.debug61.absolute.block;

import com.debug61.absolute.Absolute;
import com.debug61.absolute.item.ABSTab;
import com.debug61.absolute.item.ABSItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ABSBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Absolute.MOD_ID);


    public static final RegistryObject<Block> ABSOLUTE_BLOCK = registerBlock("abs_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().strength(5.0F, 6.0F).
                    sound(SoundType.METAL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ABSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ABSTab.ABSOLUTE_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
