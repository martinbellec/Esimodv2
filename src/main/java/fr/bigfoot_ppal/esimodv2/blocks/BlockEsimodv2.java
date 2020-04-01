package fr.bigfoot_ppal.esimodv2.blocks;

import fr.bigfoot_ppal.esimodv2.Esimodv2;
import fr.bigfoot_ppal.esimodv2.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockEsimodv2 extends Block
{

    public BlockEsimodv2(String name, Properties properties)
    {
        super(properties);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
        ModBlocks.blockItems.add((BlockItem) new BlockItem(this, new Item.Properties()).setRegistryName(getRegistryName()));
    }
}
