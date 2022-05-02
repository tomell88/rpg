package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.items.Item;

import java.util.List;

public interface Entity {

    int getId();

    String getName();

    Inventory getInventory();

    List<Item> getWeapon();

    List<Item> getArmour();
}
