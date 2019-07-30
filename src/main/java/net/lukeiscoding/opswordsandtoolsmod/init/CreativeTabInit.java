package net.lukeiscoding.opswordsandtoolsmod.init;

import net.lukeiscoding.opswordsandtoolsmod.tabs.CreativeTabOpSowrdsAndToolsModMaterials;
import net.lukeiscoding.opswordsandtoolsmod.tabs.CreativeTabOpSwords;
import net.lukeiscoding.opswordsandtoolsmod.tabs.CreativeTabOpTools;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabInit {

    public static final CreativeTabs opswords = new CreativeTabOpSwords("opswords");
    public static final CreativeTabs optools = new CreativeTabOpTools("optools");
    public static final CreativeTabs opmaterials = new CreativeTabOpSowrdsAndToolsModMaterials("opmaterials");
}
