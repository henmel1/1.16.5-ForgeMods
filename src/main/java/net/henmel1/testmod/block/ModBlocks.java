package net.henmel1.testmod.block;

import net.henmel1.testmod.TestMod;
import net.henmel1.testmod.item.ModItemGroup;
import net.henmel1.testmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //creates quanthracite ore
    public static final RegistryObject<Block> QUANTHRACITE_ORE = registerBlock("quanthracite_ore",
            () -> new ModOreBlock(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(6f)));

    //creates block of quanthracite
    public static final RegistryObject<Block> QUANTHRACITE_BLOCK = registerBlock("quanthracite_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(7f)));

    //creates unbreakable dirt
    public static final RegistryObject<Block> UNBREAKABLE_DIRT = registerBlock("unbreakable_dirt",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(-1).hardnessAndResistance(-1f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.TEST_MOD)));
    }
}
