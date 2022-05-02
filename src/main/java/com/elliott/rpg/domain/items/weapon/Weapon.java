package com.elliott.rpg.domain.items.weapon;

import com.elliott.rpg.domain.items.Item;

public interface Weapon extends Item {

    double getAttackSpeed();

    int getAttackDamage();

    double getDamagePerSecond();
}
