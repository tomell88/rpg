package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.ItemType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.stream.Collectors;

public class Enemy implements Entity {

    private int id;
    private String name;
    private Inventory inventory;

    public Enemy(int id, String name, Inventory inventory) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    @JsonIgnore
    public List<Item> getWeapon() {
        return getInventory().getItems()
                .stream()
                .filter(item -> item.getItemType().equals(ItemType.WEAPON))
                .collect(Collectors.toList());
    }

    @Override
    @JsonIgnore
    public List<Item> getArmour() {
        return getInventory().getItems()
                .stream()
                .filter(item -> item.getItemType().equals(ItemType.ARMOUR))
                .collect(Collectors.toList());
    }
}
