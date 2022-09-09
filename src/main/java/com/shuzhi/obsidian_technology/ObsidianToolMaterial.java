package com.shuzhi.obsidian_technology;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import com.shuzhi.obsidian_technology.Obsidian_pickaxe;

public class ObsidianToolMaterial  implements ToolMaterial {
    public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();
    public static Obsidian_pickaxe OBSIDIAN_PICKAXE = new Obsidian_pickaxe(ObsidianToolMaterial.INSTANCE, 999999999, 99999999999.5F, new Item.Settings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP));
    public static Obsidian_axe OBSIDIAN_AXE = new Obsidian_axe(ObsidianToolMaterial.INSTANCE, 999999999, 99999999999.5F, new Item.Settings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP));
    public static Obsidian_hoeitem OBSIDIAN_HOE = new Obsidian_hoeitem(ObsidianToolMaterial.INSTANCE, 999999999, 99999999999.5F, new Item.Settings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP));

    public static ToolItem OBSIDIAN_SHOVEL = new ShovelItem(ObsidianToolMaterial.INSTANCE, 999999999, 9999999999999.5F, new Item.Settings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP));

    public static ToolItem OBSIDIAN_SWORD = new SwordItem(ObsidianToolMaterial.INSTANCE, 999999999, 99999999999999.5F, new Item.Settings().group(Obsidian_technology.OBSIDIAN_TECHNOLOGY_GROUP));

    @Override
    public int getDurability() {
        return 999999999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9999999999999999.0F;
    }

    @Override
    public float getAttackDamage() {
        return 50.0F;
    }

    @Override
    public int getMiningLevel() {
        return 10;
    }

    @Override
    public int getEnchantability() {
        return 999999999;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
