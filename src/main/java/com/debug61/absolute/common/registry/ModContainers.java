package com.debug61.absolute.common.registry;

import com.debug61.absolute.Absolute;
import com.debug61.absolute.common.inventory.container.GeneratorContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Absolute.MOD_ID);

    public static final RegistryObject<ContainerType<GeneratorContainer>> GENERATOR_CONTAINER = CONTAINERS.register("generator_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World level = inv.player.getCommandSenderWorld();
                return new GeneratorContainer(windowId, level, pos, inv, inv.player);
            })));
}
