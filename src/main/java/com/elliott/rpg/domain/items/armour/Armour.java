package com.elliott.rpg.domain.items.armour;

import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.ItemType;

public interface Armour extends Item {

    int getDefence();

    @Override
    default ItemType getItemType() {
        return ItemType.ARMOUR;
    }
}
