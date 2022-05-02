package com.elliott.rpg.core;

import com.elliott.rpg.domain.Entity;
import com.elliott.rpg.domain.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private static final String TEST_PLAYER = "TEST_PLAYER";

    @Test
    public void testStartingGameAddsPlayerToEntityLocationMap() {
        Game game = Game.getGame();
        game.setPlayer(new Player(TEST_PLAYER));
        Entity entityOne = game.getEntityLocationMap().getEntityMap().get(1);
        assertEquals(1, entityOne.getId());
        assertEquals(TEST_PLAYER, entityOne.getName());
    }

    @Test
    public void testStartingGameAddsPlayerToStartingLocation() {
        Game game = Game.getGame();
        game.setPlayer(new Player(TEST_PLAYER));
        int startingLocation = game.getGameMap().getMap()[0][0];
        int notStartingLocation = game.getGameMap().getMap()[0][1];
        int alsoNotStartingLocation = game.getGameMap().getMap()[1][1];
        assertEquals(0, notStartingLocation);
        assertEquals(0, alsoNotStartingLocation);
        assertEquals(1, startingLocation);

    }

    @Test
    public void testGameHasOnePlayerAndMultipleEnemies() {

    }

}
