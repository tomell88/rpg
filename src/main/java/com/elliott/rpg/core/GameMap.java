package com.elliott.rpg.core;

public class GameMap {

    private static final int MAP_SIZE = 10;
    private final int[][] map;

    public GameMap() {
        map = new int[MAP_SIZE][MAP_SIZE];

        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = 0;
            }
        }

    }

    public void insert(int x, int y, int value) {
        map[x][y] = value;
    }

    public int[][] getMap() {
        return map;
    }

    public int getMapSize() {
        return map.length;
    }
}
