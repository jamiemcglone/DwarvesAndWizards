import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    Weapon weapon;
    Barbarian barbarian;
    Monster monster;
    Room room;

    @Before
    public void setUp() {
        weapon = Weapon.AXE;
        barbarian = new Barbarian(0, "Mario", 75, weapon);
        monster = new Monster(100, "George");
        room = new Room(1000, monster);
    }

    @Test
    public void getWeapon() {
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void setWeapon() {
        barbarian.setWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

    @Test
    public void getAttack() {
        assertEquals(weapon, barbarian.getAttack());
    }

    @Test
    public void getTreasure() {
        assertEquals(0, barbarian.getTreasure());
    }

    @Test
    public void getName() {
        assertEquals("Mario", barbarian.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(75, barbarian.getHealth());
    }

    @Test
    public void addTreasure() {
        barbarian.addTreasure(room);
        assertEquals(1000, barbarian.getTreasure());
    }

    @Test
    public void removeHealth() {
        barbarian.removeHealth(25);
        assertEquals(50, barbarian.getHealth());
    }
}