package com.shuzhi.obsidian_technology.Items_conf;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.minecraft.text.Text;

import java.util.List;

public class obsidianingot extends Item{
    public obsidianingot(Item.Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // 默认为白色文本
        tooltip.add( new TranslatableText("item.obsidian_technology.obsidian-ingot.tooltip") );
    }
}
