package com.elliott.rpg.domain.items.armour;

import com.elliott.rpg.domain.items.ItemRarity;

public class LeatherArmour implements Armour {

    private final int itemLevel;
    private final int defence;
    private final ItemRarity itemRarity;

    public LeatherArmour(int itemLevel, int defence, ItemRarity itemRarity) {
        this.itemLevel = itemLevel;
        this.defence = defence;
        this.itemRarity = itemRarity;
    }

    @Override
    public int getLevel() {
        return itemLevel;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public ItemRarity getItemRarity() {
        return itemRarity;
    }
}
