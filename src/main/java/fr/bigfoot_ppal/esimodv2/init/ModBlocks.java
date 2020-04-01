package fr.bigfoot_ppal.esimodv2.init;

import com.google.common.collect.Lists;
import fr.bigfoot_ppal.esimodv2.Esimodv2;
import fr.bigfoot_ppal.esimodv2.blocks.BlockEsimodv2;
import fr.bigfoot_ppal.esimodv2.Esimodv2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Esimodv2.MODID)
public class ModBlocks
{

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static List<Block> blocks;
    public static List<BlockItem> blockItems;

    public static Block blue_emerald_block;
    public static Block elemental_ore;

    public static void init()
    {
        blocks = Lists.newArrayList();
        blockItems = Lists.newArrayList();

        blue_emerald_block = new BlockEsimodv2("blue_emerald_block", Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 20f).harvestTool(ToolType.PICKAXE).harvestLevel(1));
        elemental_ore = new BlockEsimodv2("elemental_ore", Block.Properties.create(Material.ROCK).hardnessAndResistance(5f, 20f).harvestTool(ToolType.PICKAXE).harvestLevel(2));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)
    {
        init();

        for(Block block : blocks)
        {
            e.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> e)
    {
        for(BlockItem blocki : blockItems)
        {
            e.getRegistry().register(blocki);
        }
    }
}
