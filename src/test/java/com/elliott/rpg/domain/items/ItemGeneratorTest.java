package com.elliott.rpg.domain.items;

import com.elliott.rpg.domain.items.weapon.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemGeneratorTest {

    @Test
    public void testItemGeneration() {
        ItemGenerator weaponGenerator = new ItemGenerator();
        Weapon generatedItem = weaponGenerator.generateWeapon(1, 1.4, 10);

        assertEquals(10, generatedItem.getAttackDamage());
        assertEquals(1.4, generatedItem.getAttackSpeed());
        assertEquals(1, generatedItem.getLevel());
    }
}
