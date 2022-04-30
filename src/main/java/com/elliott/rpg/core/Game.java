package com.elliott.rpg.core;

import com.elliott.rpg.domain.Player;

public class Game {

    private final GameMap gameMap;
    private final EntityLocationMap entityLocationMap;
    private static Game INSTANCE;

    private Game() {
        this.gameMap = new GameMap();
        this.entityLocationMap = new EntityLocationMap();

        Player player = new Player("Tom Elliott");

        gameMap.insert(0,0,player.getId());
        entityLocationMap.addToEntityLocationMap(player.getId(), player);

        System.out.println("Created game for the first time");
    }

    public static Game getGame() {
        if(INSTANCE == null) {
            INSTANCE = new Game();
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
