package fr.bigfoot_ppal.esimodv2;

import fr.bigfoot_ppal.esimodv2.init.ModBlocks;
import fr.bigfoot_ppal.esimodv2.init.ModItems;
import fr.bigfoot_ppal.esimodv2.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod(Esimodv2.MODID)
public class Esimodv2
{
    public static final String MODID = "esimodv2";

    public static final Logger logger = Logger.getLogger(MODID);

    public Esimodv2()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }


    public static final ItemGroup esimodv2Tab = new ItemGroup("esimodv2_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.elemental_gem);
        }
    };

    public void CommonSetup(final FMLCommonSetupEvent e)
    {
        OreGeneration.setupGeneration();
        logger.info("Common setup finished !");
    }






    public void setup(final FMLCommonSetupEvent e)
    {
        logger.info("Mod Setup Loading !");
    }

    public void clientSetup(final FMLClientSetupEvent e)
    {
        logger.info("Mod Client Setup Loading !");
    }
}
