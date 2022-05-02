package com.elliott.rpg.core;

import com.elliott.rpg.domain.Player;

public class Game {

    private final GameMap gameMap;
    private final EntityLocationMap entityLocationMap;
    private final Player player;

    private Game(String playerName) {
        this.gameMap = new GameMap();
        this.entityLocationMap = new EntityLocationMap();
        player = new Player(playerName);

        gameMap.insert(0,0,player.getId());
        entityLocationMap.addToEntityLocationMap(player.getId(), player);

        System.out.println("Created game for the first time");
    }

    public static Game getOrCreateGame(String playerName) {
        return new Game(playerName);
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public EntityLocationMap getEntityLocationMap() {
        return entityLocationMap;
    }

    public Player getPlayer() {
        return player;
    }
}
