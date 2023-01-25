import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {
    Monster monster;
    Weapon sword;
    Weapon axe;

    @Before
    public void setUp() throws Exception {
        monster = new Monster(100, "George");
        sword = Weapon.SWORD;
        axe = Weapon.AXE;
    }

    @Test
    public void getName() {
        assertEquals("Sword", sword.getName());
        assertEquals("Axe", axe.getName());
    }

    @Test
    public void getDamage() {
        assertEquals(25, sword.getDamage());
        assertEquals(34, axe.getDamage());
    }

    @Test
    public void doAttack() {
        sword.doAttack(monster);
        assertEquals(75, monster.getHealth());
        axe.doAttack(monster);
        assertEquals(41, monster.getHealth());
    }
}