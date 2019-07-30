package net.lukeiscoding.opswordsandtoolsmod.items;

import net.lukeiscoding.opswordsandtoolsmod.Main;
import net.lukeiscoding.opswordsandtoolsmod.init.CreativeTabInit;
import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.lukeiscoding.opswordsandtoolsmod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemEmeraldIngot extends Item implements IHasModel {

    public ItemEmeraldIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabInit.opmaterials);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRederer(this, 0, "inventory");
    }
}
