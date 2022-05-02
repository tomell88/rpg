package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.items.ItemRarity;
import com.elliott.rpg.domain.items.armour.LeatherArmour;
import com.elliott.rpg.domain.items.weapon.Sword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testPlayerHasInventory() {
        Player player = new Player("Test Player");
        Inventory inventory = new Inventory();

        Sword sword = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        LeatherArmour armour = new LeatherArmour(1, 12, ItemRarity.NORMAL);
        inventory.addItem(sword);
        inventory.addItem(armour);

        player.setInventory(inventory);

        assertEquals(2, player.getInventory().getItems().size());
        assertEquals(sword, player.getWeapon().get(0));
        assertEquals(armour, player.getArmour().get(0));
    }

    @Test
    public void testPlayerHasInventoryWithMultipleWeapons() {
        Player player = new Player("Test Player");
        Inventory inventory = new Inventory();

        Sword sword = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        Sword swordTwo = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        LeatherArmour armour = new LeatherArmour(1, 12, ItemRarity.NORMAL);
        inventory.addItem(sword);
        inventory.addItem(swordTwo);
        inventory.addItem(armour);

        player.setInventory(inventory);

        assertEquals(3, player.getInventory().getItems().size());
        assertEquals(sword, player.getWeapon().get(0));
        assertEquals(swordTwo, player.getWeapon().get(1));
        assertEquals(armour, player.getArmour().get(0));
    }
}
