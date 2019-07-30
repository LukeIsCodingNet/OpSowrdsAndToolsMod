package net.lukeiscoding.opswordsandtoolsmod.tabs;

import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabOpTools extends CreativeTabs {

    public CreativeTabOpTools(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.super_pic);
    }
}
