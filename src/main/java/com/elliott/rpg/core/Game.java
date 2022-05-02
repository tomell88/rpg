package com.elliott.rpg.core;

import com.elliott.rpg.domain.Player;

public class Game {

    private final GameMap gameMap;
    private final EntityLocationMap entityLocationMap;
    private static Game INSTANCE;

    private Game(String playerName) {
        this.gameMap = new GameMap();
        this.entityLocationMap = new EntityLocationMap();

        Player player = new Player(playerName);

        gameMap.insert(0,0,player.getId());
        entityLocationMap.addToEntityLocationMap(player.getId(), player);

        System.out.println("Created game for the first time");
    }

    public static Game getOrCreateGame(String playerName) {
        if(INSTANCE == null) {
            INSTANCE = new Game(playerName);
        }
        return INSTANCE;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public EntityLocationMap getEntityLocationMap() {
        return entityLocationMap;
    }
}
