package com.debug61.absolute.common.registry;

import com.debug61.absolute.Absolute;
import com.debug61.absolute.common.tileentity.GeneratorTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Absolute.MOD_ID);

    public static RegistryObject<TileEntityType<GeneratorTileEntity>> GENERATOR_TILE = TILE_ENTITIES.register("generator_tile", () -> TileEntityType.Builder.of(
            GeneratorTileEntity::new, ModBlocks.ABSOLUTE_GENERATOR.get()).build(null));
}
