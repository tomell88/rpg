package com.elliott.rpg.core;

import com.elliott.rpg.domain.Player;

public class Game {

    private final GameMap gameMap;
    private final EntityLocationMap entityLocationMap;
    private static Game INSTANCE;
    private Player player;

    private Game() {
        this.gameMap = new GameMap();
        this.entityLocationMap = new EntityLocationMap();
    }

    public static Game getGame() {
        if(INSTANCE == null) {
            INSTANCE = new Game();
        }

        return INSTANCE;
    }

    public void setPlayer(Player player) {
        this.player = player;

        gameMap.insert(0,0,player.getId());
        entityLocationMap.addToEntityLocationMap(player.getId(), player);
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
