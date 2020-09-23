package com.dev.Xena.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.List;

public class AmphiumOreBlock extends OreBlock{

    public AmphiumOreBlock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(11.0F, 13.0F)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));

        }

        @Override
        public void addInformation(ItemStack stack, IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new StringTextComponent(   "\u00A76" + "Amphium is named after the birthplace of Xena" + "\u00A76"));
        }
    }


