package com.elliott.rpg.domain.items.weapon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwordTest {

    @Test
    public void testCalculateDamagePerSecond() {
        Weapon sword = new Sword(1, 1.4, 100);
        double expectedDamagePerSecond = sword.getAttackSpeed() * sword.getAttackDamage();
        assertEquals(expectedDamagePerSecond, sword.getDamagePerSecond());
    }

}
