package com.elliott.rpg.domain.inventory;

import com.elliott.rpg.domain.items.ItemRarity;
import com.elliott.rpg.domain.items.armour.LeatherArmour;
import com.elliott.rpg.domain.items.weapon.Sword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest {

    @Test
    public void testAddItemToInventory() {
        Inventory inventory = new Inventory();

        Sword sword = new Sword(1, 1.2, 10, ItemRarity.NORMAL);
        LeatherArmour armour = new LeatherArmour(1, 12, ItemRarity.NORMAL);
        inventory.addItem(sword);
        inventory.addItem(armour);

        assertEquals(2, inventory.getItems().size());
        inventory.removeItem(sword);
        assertEquals(1, inventory.getItems().size());
    }
}
