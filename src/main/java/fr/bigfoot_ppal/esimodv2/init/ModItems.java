package fr.bigfoot_ppal.esimodv2.init;

import com.google.common.collect.Lists;
import fr.bigfoot_ppal.esimodv2.Esimodv2;
import fr.bigfoot_ppal.esimodv2.items.ItemEsimodv2;
import fr.bigfoot_ppal.esimodv2.Esimodv2;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Esimodv2.MODID)
public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static List<Item> items;

    public static Item diamond_stick;

    public static Item elemental_gem;

    private static void init()
    {
        items = Lists.newArrayList();

        diamond_stick = new ItemEsimodv2("diamond_stick");
        elemental_gem = new ItemEsimodv2("elemental_gem");
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {
        init();

        for(Item item : items)
        {
            e.getRegistry().register(item);
        }
    }
}
