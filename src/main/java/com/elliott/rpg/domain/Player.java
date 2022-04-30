package com.elliott.rpg.domain;

public class Player implements Entity {

    private static final int id = 1;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
