package com.elliott.rpg.domain.items.weapon;

import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.ItemType;

public interface Weapon extends Item {

    double getAttackSpeed();

    int getAttackDamage();

    double getDamagePerSecond();

    default ItemType getItemType() {
        return ItemType.WEAPON;
    }
}
