package net.lukeiscoding.opswordsandtoolsmod.items;

import net.lukeiscoding.opswordsandtoolsmod.Main;
import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.lukeiscoding.opswordsandtoolsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTestItem extends Item implements IHasModel {

    public ItemTestItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRederer(this, 0, "inventroy");
    }
}
