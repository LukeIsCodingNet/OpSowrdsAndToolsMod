package net.lukeiscoding.opswordsandtoolsmod.tabs;

import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabOpSwords extends CreativeTabs {

    public CreativeTabOpSwords(String label) {
        super("opswords");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.dragon_slayer);
    }
}
