package fr.bigfoot_ppal.esimodv2.items;

import fr.bigfoot_ppal.esimodv2.Esimodv2;
import fr.bigfoot_ppal.esimodv2.init.ModItems;
import fr.bigfoot_ppal.esimodv2.Esimodv2;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class ItemEsimodv2 extends Item
{

    public ItemEsimodv2(String name, Properties properties)
    {
        super(properties.group(Esimodv2.esimodv2Tab));

        setRegistryName(name);

        ModItems.INSTANCE.items.add(this);
    }

    public ItemEsimodv2(String name)
    {
        this(name, new Properties());
    }
}
