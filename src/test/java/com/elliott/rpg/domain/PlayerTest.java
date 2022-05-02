package com.elliott.rpg.domain;

import com.elliott.rpg.domain.inventory.Inventory;
import com.elliott.rpg.domain.inventory.InventoryFilter;
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
        player.getInventory().addItem(sword);
        player.getInventory().addItem(armour);

        assertEquals(2, player.getInventory().getItems().size());
        assertEquals(sword, InventoryFilter.getWeapon(player.getInventory()).get(0));
        assertEquals(armour, InventoryFilter.getArmour(player.getInventory()).get(0));
    }

    @Test
    public void testPlayerHasInventoryWithMultipleWeapons() {
        Player player = new Player("Test Player");
        Inventory inventory = new Inventory();

        Sword sword = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        Sword swordTwo = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        LeatherArmour armour = new LeatherArmour(1, 12, ItemRarity.NORMAL);

        player.getInventory().addItem(sword);
        player.getInventory().addItem(swordTwo);
        player.getInventory().addItem(armour);

        assertEquals(3, player.getInventory().getItems().size());

        assertEquals(sword, InventoryFilter.getWeapon(player.getInventory()).get(0));
        assertEquals(swordTwo, InventoryFilter.getWeapon(player.getInventory()).get(1));
        assertEquals(armour, InventoryFilter.getArmour(player.getInventory()).get(0));
    }
}
