package fr.endloww.mod.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    ULTIMATE(0,3060,16.0F,8.0F,25, () -> {
        return Ingredient.of(Items.CHERRY_ITEM.get());
    });
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability =enchantability;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
    }
    @Override
    public int getUses(){
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }
    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }
    @Override
    public int getLevel(){
        return harvestLevel;
    }
    @Override
    public int getEnchantmentValue(){
        return enchantability;
    }
    @Override
    public Ingredient getRepairIngredient(){
        return repairMaterial.get();
    }
}
