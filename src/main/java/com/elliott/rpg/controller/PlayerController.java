package com.elliott.rpg.controller;

import com.elliott.rpg.core.Game;
import com.elliott.rpg.domain.Player;
import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.items.Item;
import com.elliott.rpg.domain.items.weapon.Sword;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @GetMapping("/player")
    public Player getPlayer(@RequestParam String playerName) {
        return Game.getOrCreateGame(playerName).getPlayer();
    }

    @GetMapping("/player/inventory")
    public Inventory getPlayerInventory(@RequestParam String playerName) {
        return Game.getOrCreateGame(playerName).getPlayer().getInventory();
    }

    @PutMapping("/player/inventory")
    public Inventory addItemToPlayerInventory(@RequestParam String playerName, @RequestParam String itemJson) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Item item = mapper.readValue(itemJson, Sword.class);

        Inventory inventory = Game.getOrCreateGame(playerName).getPlayer().getInventory();
        inventory.addItem(item);
        return inventory;
    }
}
