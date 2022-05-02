package com.elliott.rpg.domain.items;

import com.elliott.rpg.domain.items.weapon.Sword;
import com.elliott.rpg.domain.items.weapon.Weapon;

public class ItemGenerator {

    public Weapon generateWeapon(int itemLevel, double attackSpeed, int attackDamage) {
        return new Sword(itemLevel, attackSpeed, attackDamage, getItemRarity());
    }

    /**
     * Item Rarity algorithm.
     *
     * Basic implementation has a:
     * 0.1% chance of Legendary
     * 1% chance of Rare or Higher
     * 10% chance of Magic or Higher
     */
    public ItemRarity getItemRarity() {

        int randomNumber = (int) (Math.random() * 1000);

        ItemRarity rarity =  ItemRarity.NORMAL;

        if(randomNumber >= 999) {
            rarity = ItemRarity.LEGENDARY;
        } else if(randomNumber >= 990) {
            rarity = ItemRarity.RARE;
        } else if(randomNumber >= 900) {
            rarity = ItemRarity.MAGIC;
        }

        return rarity;

    }

}
