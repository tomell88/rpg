package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;

public class Enemy implements Entity {

    private final int id;
    private final String name;
    private final Inventory inventory;

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
}
