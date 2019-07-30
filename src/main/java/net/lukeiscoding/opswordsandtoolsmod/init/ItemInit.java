package net.lukeiscoding.opswordsandtoolsmod.init;

import net.lukeiscoding.opswordsandtoolsmod.items.ItemEmeraldIngot;
import net.lukeiscoding.opswordsandtoolsmod.items.ItemEmeraldNugget;
import net.lukeiscoding.opswordsandtoolsmod.items.ItemEmeraldRod;
import net.lukeiscoding.opswordsandtoolsmod.items.ItemTestItem;
import net.lukeiscoding.opswordsandtoolsmod.items.axes.AxeWoodChuck;
import net.lukeiscoding.opswordsandtoolsmod.items.pics.PicEmeraldPic;
import net.lukeiscoding.opswordsandtoolsmod.items.pics.PicSuperPic;
import net.lukeiscoding.opswordsandtoolsmod.items.swords.SwordBlazeKiller;
import net.lukeiscoding.opswordsandtoolsmod.items.swords.SwordDragonSlayer;
import net.lukeiscoding.opswordsandtoolsmod.items.swords.SwordEmeraldSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();

    // Tool Materials
    public static final Item.ToolMaterial dragon_slayer_tool_material = EnumHelper.addToolMaterial("dragon_slayer_tool_material", 0, 200, 88.5f, 40000.0f, 1);
    public static final Item.ToolMaterial super_pic_tool_material = EnumHelper.addToolMaterial("super_pic_tool_material", 1, 225, 99999999, 45.5f, 2);
    public static final Item.ToolMaterial wood_chuck_tool_material = EnumHelper.addToolMaterial("wood_chuck_tool_material", 0, 300, 99999999, 66.6f, 3);
    public static final Item.ToolMaterial blaze_killer_tool_material = EnumHelper.addToolMaterial("blaze_killer_tool_material", 0, 400, 77.0f, 20.0f, 2);
    public static final Item.ToolMaterial emerald_tool_material = EnumHelper.addToolMaterial("emerald_pic_tool_material", 3, 400, 800.0f, 95.5f, 4);

    // items
    public static final Item test_item = new ItemTestItem("test_item");
    public static final Item emerald_rod = new ItemEmeraldRod("emerald_rod");
    public static final Item emerald_ingot = new ItemEmeraldIngot("emerald_ingot");
    public static final Item emerald_nugget = new ItemEmeraldNugget("emerald_nugget");

    // swords
    public static final Item dragon_slayer = new SwordDragonSlayer("dragon_slayer", dragon_slayer_tool_material);
    public static final Item blze_killer = new SwordBlazeKiller("blaze_killer", blaze_killer_tool_material);
    public static final Item emerald_sword = new SwordEmeraldSword("emerald_sword", emerald_tool_material);

    // pics
    public static final Item super_pic = new PicSuperPic("super_pic", super_pic_tool_material);
    public static final Item emerald_pic = new PicEmeraldPic("emerald_pic", emerald_tool_material);

    // axes
    public static final Item wood_chuck = new AxeWoodChuck("wood_chuck", wood_chuck_tool_material);
}
