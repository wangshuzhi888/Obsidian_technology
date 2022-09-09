package com.shuzhi.obsidian_technology;

import com.shuzhi.obsidian_technology.Items_conf.obsidianingot;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Obsidian_technology implements ModInitializer {

    public static final obsidianingot OBSIDIAN_INGOT = new obsidianingot(new FabricItemSettings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP).maxCount(64));
    public static final ItemGroup OBSIDIAN_TECHNOLOGY_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("obsidian_technology", "obsidian_technology_group"))
            .icon(() -> new ItemStack(OBSIDIAN_INGOT)).appendItems(stacks ->{
                stacks.add(new ItemStack(OBSIDIAN_INGOT));
                stacks.add(new ItemStack(ObsidianToolMaterial.OBSIDIAN_AXE));
                stacks.add(new ItemStack(ObsidianToolMaterial.OBSIDIAN_HOE));
                stacks.add(new ItemStack(ObsidianToolMaterial.OBSIDIAN_PICKAXE));
                stacks.add(new ItemStack(ObsidianToolMaterial.OBSIDIAN_SHOVEL));
                stacks.add(new ItemStack(ObsidianToolMaterial.OBSIDIAN_SWORD));
            }).build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_axe"), ObsidianToolMaterial.OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_hoe"), ObsidianToolMaterial.OBSIDIAN_HOE);
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_pickaxe"), ObsidianToolMaterial.OBSIDIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_shovel"), ObsidianToolMaterial.OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("obsidian_technology", "obsidian_sword"), ObsidianToolMaterial.OBSIDIAN_SWORD);
    }
}
