package net.henmel1.testmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup TEST_MOD = new ItemGroup("testModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.QUANTHRACITE.get());
        }
    };
}
