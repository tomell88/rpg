package com.elliott.rpg.domain.inventory;

import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.ItemType;

import java.util.List;
import java.util.stream.Collectors;

public class InventoryFilter {

    public static List<Item> getWeapon(Inventory inventory) {
        return inventory.getItems()
                .stream()
                .filter(item -> item.getItemType().equals(ItemType.WEAPON))
                .collect(Collectors.toList());
    }

    public static List<Item> getArmour(Inventory inventory) {
        return inventory.getItems()
                .stream()
                .filter(item -> item.getItemType().equals(ItemType.ARMOUR))
                .collect(Collectors.toList());
    }
}
