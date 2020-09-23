package com.dev.Xena.util;

import com.dev.Xena.Xena;
import com.dev.Xena.blocks.AmphiumOreBlock;
import com.dev.Xena.blocks.BlockItemBase;
import com.dev.Xena.blocks.PotiumOreBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Xena.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Xena.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Blocks
    public static final RegistryObject<Block> POTIUM_ORE_BLOCK = BLOCKS.register("potium_ore_block", PotiumOreBlock::new);
    public static final RegistryObject<Block> AMPHIUM_ORE_BLOCK = BLOCKS.register("amphium_ore_block", AmphiumOreBlock::new);

//BlockItems
public static final RegistryObject<Item> POTIUM_ORE_BLOCK_ITEM = ITEMS.register("potium_ore_block", () -> new BlockItemBase(POTIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> AMPHIUM_ORE_BLOCK_ITEM = ITEMS.register("amphium_ore_block", () -> new BlockItemBase(AMPHIUM_ORE_BLOCK.get()));

}

