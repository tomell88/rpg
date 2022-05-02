package com.elliott.rpg.domain.items.armour;

public class LeatherArmour implements Armour {

    private final int itemLevel;
    private final int defence;

    public LeatherArmour(int itemLevel, int defence) {
        this.itemLevel = itemLevel;
        this.defence = defence;
    }

    @Override
    public int getLevel() {
        return itemLevel;
    }

    @Override
    public int getDefence() {
        return defence;
    }
}
