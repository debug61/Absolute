package com.debug61.absolute.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ABSTab {
    public static final ItemGroup ABSOLUTE_TAB = new ItemGroup("absoluteModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ABSItems.ABSOLUTE_DUST.get());
        }
    };
}
