package net.lukeiscoding.opswordsandtoolsmod;

import net.lukeiscoding.opswordsandtoolsmod.proxy.CommonProxy;
import net.lukeiscoding.opswordsandtoolsmod.tabs.CreativeTabOpSwords;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MOD_ID, name = Main.MOD_NAME, version = Main.MOD_VER, acceptedMinecraftVersions = Main.MC_VER)
public class Main {

    public static final String MOD_ID = "opswordsandtoolsmod";
    public static final String MOD_NAME = "Op Swords and Tools Mod";
    public static final String MOD_VER = "0.0.1";
    public static final String MC_VER = "[1.12.2]";

    public static final String CLIENT_PROXY = "net.lukeiscoding.opswordsandtoolsmod.proxy.ClientProxy";

    @Mod.Instance
    public static Main main;

    @SidedProxy(clientSide = Main.CLIENT_PROXY)
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger(Main.MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.info(MOD_ID + "preInit!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(MOD_ID + "init!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        logger.info(MOD_ID + "postInit");
    }
}
