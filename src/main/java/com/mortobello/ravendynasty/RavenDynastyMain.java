package com.mortobello.ravendynasty;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = RavenDynasty.MODID, name = RavenDynasty.NAME, version = RavenDynasty.VERSION)
public class RavenDynasty
{
    public static final String MODID = "ravendynasty";
    public static final String NAME = "Raven Dynasty";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}