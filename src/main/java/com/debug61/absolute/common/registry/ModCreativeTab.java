package com.debug61.absolute.common.registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeTab {

    public static final ItemGroup ABSOLUTE_TAB = new ItemGroup("absoluteModTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ABSOLUTE_INGOT.get());
        }
    };
}
