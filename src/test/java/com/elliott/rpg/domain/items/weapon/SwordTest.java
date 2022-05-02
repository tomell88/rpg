package com.elliott.rpg.domain.items.weapon;

import com.elliott.rpg.domain.items.ItemRarity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwordTest {

    @Test
    public void testCalculateDamagePerSecond() {
        Weapon sword = new Sword(1, 1.4, 100, ItemRarity.NORMAL);
        double expectedDamagePerSecond = sword.getAttackSpeed() * sword.getAttackDamage();
        assertEquals(expectedDamagePerSecond, sword.getDamagePerSecond());
    }

}
