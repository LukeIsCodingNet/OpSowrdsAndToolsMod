package net.lukeiscoding.opswordsandtoolsmod.items.swords;

import net.lukeiscoding.opswordsandtoolsmod.Main;
import net.lukeiscoding.opswordsandtoolsmod.init.CreativeTabInit;
import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.lukeiscoding.opswordsandtoolsmod.util.IHasModel;
import net.minecraft.item.ItemSword;

public class SwordBlazeKiller extends ItemSword implements IHasModel {

    public SwordBlazeKiller(String name, ToolMaterial material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabInit.opswords);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRederer(this, 0, "inventory");
    }
}
