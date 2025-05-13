package com.debug61.absolute.common.registry;

import com.debug61.absolute.Absolute;
import com.debug61.absolute.common.block.PavingStoneTravel;
import com.debug61.absolute.common.blockentity.GeneratorBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Absolute.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeTab.ABSOLUTE_TAB)));
    }

    public static final RegistryObject<Block> ABSOLUTE_BLOCK = registerBlock("abs_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PAVING_STONE_TRAVEL = registerBlock("paving_stone_travel",
            () -> new PavingStoneTravel(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(2).strength(6.0f)
                    .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> ABSOLUTE_GENERATOR = registerBlock("abs_generator",
            () -> new GeneratorBlock(AbstractBlock.Properties.of(Material.METAL)
                    .strength(5.0F, 6.0F).harvestLevel(2)
                    .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));

}
