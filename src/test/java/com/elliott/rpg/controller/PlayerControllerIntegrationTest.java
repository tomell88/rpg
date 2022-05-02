package com.elliott.rpg.controller;

import com.elliott.rpg.core.Game;
import com.elliott.rpg.domain.Player;
import com.elliott.rpg.domain.inventory.Inventory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPlayer() {

        Game.getGame().setPlayer(new Player("Test Player"));

        try {
            this.mockMvc.perform(MockMvcRequestBuilders.get("/player"))
                    .andDo(print())
                    .andExpect(content().string(containsString(
                            "{\"name\":\"Test Player\",\"inventory\":{\"items\":[]},\"id\":1}")))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetPlayerInventory() {

        Game.getGame().setPlayer(new Player("Test Player"));

        try {
            this.mockMvc.perform(MockMvcRequestBuilders.get("/player/inventory"))
                    .andDo(print())
                    .andExpect(content().string(containsString("{\"items\":[]}")))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddItemToPlayerInventory() {

        Game.getGame().setPlayer(new Player("Test Player"));

        String item = "{\"attackSpeed\":1.2,\"attackDamage\":10,\"itemRarity\":\"NORMAL\"}";
        try {
            this.mockMvc.perform(MockMvcRequestBuilders.put("/player/inventory")
                            .queryParam("itemJson", item))
                    .andDo(print())
                    .andExpect(content().string(containsString("{\"items\":[{\"attackSpeed\":1.2,\"attackDamage\":10," +
                            "\"itemRarity\":\"NORMAL\",\"level\":0,\"damagePerSecond\":12.0,\"itemType\":\"WEAPON\"}]}")))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //reset
        Game.getGame().getPlayer().getInventory().empty();
    }
}
