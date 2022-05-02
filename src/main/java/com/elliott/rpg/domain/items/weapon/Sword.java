package com.elliott.rpg.domain.items.weapon;

import com.elliott.rpg.domain.items.ItemRarity;

public class Sword implements Weapon {

    private int itemLevel;
    private double attackSpeed;
    private int attackDamage;
    private ItemRarity itemRarity;

    public Sword() {

    }

    public Sword(int itemLevel, double attackSpeed, int attackDamage, ItemRarity itemRarity) {
        this.itemLevel = itemLevel;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.itemRarity = itemRarity;
    }

    @Override
    public int getLevel() {
        return itemLevel;
    }

    @Override
    public double getAttackSpeed() {
        return attackSpeed;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public double getDamagePerSecond() {
        return attackDamage * attackSpeed;
    }

    @Override
    public ItemRarity getItemRarity() {
        return itemRarity;
    }
}
