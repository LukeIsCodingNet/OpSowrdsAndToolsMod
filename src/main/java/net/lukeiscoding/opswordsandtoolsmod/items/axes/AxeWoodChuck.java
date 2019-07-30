package net.lukeiscoding.opswordsandtoolsmod.items.axes;

import com.google.common.collect.Sets;
import net.lukeiscoding.opswordsandtoolsmod.Main;
import net.lukeiscoding.opswordsandtoolsmod.init.CreativeTabInit;
import net.lukeiscoding.opswordsandtoolsmod.init.ItemInit;
import net.lukeiscoding.opswordsandtoolsmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class AxeWoodChuck extends ItemTool implements IHasModel {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.DOUBLE_WOODEN_SLAB, Blocks.WOODEN_SLAB, Blocks.LOG, Blocks.LOG2, Blocks.CHEST);

    public AxeWoodChuck(String name, ToolMaterial material) {
        super(material, EFFECTIVE_ON);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabInit.optools);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRederer(this, 0, "inventory");
    }
}
