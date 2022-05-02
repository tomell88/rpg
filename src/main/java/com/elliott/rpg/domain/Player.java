package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;

public class Player implements Entity {

    private static final int id = 1;
    private final String name;
    private final Inventory inventory;

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

}
