package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.ItemType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.stream.Collectors;

public class Player implements Entity {

    private static final int id = 1;
    private final String name;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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
