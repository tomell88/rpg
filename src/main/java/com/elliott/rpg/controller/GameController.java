package com.elliott.rpg.controller;

import com.elliott.rpg.core.Game;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @PostMapping("/newGame")
    public Game newGame() {
        return Game.getOrCreateGame("Player One");
    }

    @PutMapping("/update")
    public void update(@RequestBody String location) {
        //send the update to the game map
    }
}