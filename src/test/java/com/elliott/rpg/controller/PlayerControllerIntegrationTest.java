package com.elliott.rpg.controller;

import com.elliott.rpg.core.Game;
import com.elliott.rpg.domain.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerIntegrationTest {

    private static final String PLAYER_NAME = "Test Player";

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        Game.getGame().setPlayer(new Player(PLAYER_NAME));
        Game.getGame().getPlayer().getInventory().empty();
    }

    @Test
    public void testGetPlayer() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/player"))
                .andExpect(content().string(containsString(
                        "{\"name\":\"Test Player\",\"inventory\":{\"items\":[]},\"id\":1}")))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetPlayerInventory() throws Exception {

        this.mockMvc.perform(MockMvcRequestBuilders.get("/player/inventory"))
                .andExpect(content().string(containsString("{\"items\":[]}")))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddItemToPlayerInventory() throws Exception {

        String item = "{\"attackSpeed\":1.2,\"attackDamage\":10,\"itemRarity\":\"NORMAL\"}";
        this.mockMvc.perform(MockMvcRequestBuilders.put("/player/inventory")
                        .queryParam("itemJson", item))
                .andExpect(content().string(containsString("{\"items\":[{\"attackSpeed\":1.2,\"attackDamage\":10," +
                        "\"itemRarity\":\"NORMAL\",\"level\":0,\"damagePerSecond\":12.0,\"itemType\":\"WEAPON\"}]}")))
                .andExpect(status().isOk());
    }
}
