package com.lanidae.lanidaesmodularshields.tools;

import com.lanidae.lanidaesmodularshields.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    FORCE_GEM(3, 500, 11.0F, 0.0F, 10, () ->{
        return Ingredient.fromItems(RegistryHandler.FORCE_SWORD.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses(){
        return maxUses;
    }

    @Override
    public float getEfficiency(){
        return efficiency;
    }

    @Override
    public float getAttackDamage(){
        return attackDamage;
    }

    @Override
    public int getHarvestLevel(){
        return harvestLevel;
    }

    @Override
    public int getEnchantability(){
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial(){
        return repairMaterial.get();
    }
}
