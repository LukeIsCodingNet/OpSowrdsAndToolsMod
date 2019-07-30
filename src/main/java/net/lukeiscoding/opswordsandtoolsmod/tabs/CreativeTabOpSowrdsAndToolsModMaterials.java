package net.lukeiscoding.opswordsandtoolsmod.tabs;

import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabOpSowrdsAndToolsModMaterials extends CreativeTabs {

    public CreativeTabOpSowrdsAndToolsModMaterials(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.emerald_ingot);
    }
}
