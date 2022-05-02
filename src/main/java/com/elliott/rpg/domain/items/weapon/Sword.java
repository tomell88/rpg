package com.elliott.rpg.domain.items.weapon;

public class Sword implements Weapon {

    private final int itemLevel;
    private final double attackSpeed;
    private final int attackDamage;

    public Sword(int itemLevel, double attackSpeed, int attackDamage) {
        this.itemLevel = itemLevel;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
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
}
