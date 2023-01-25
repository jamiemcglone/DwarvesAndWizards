import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Monster monster;
    Room room;

    @Before
    public void setUp() {
        dwarf = new Dwarf(0, "Mario", 75);
        monster = new Monster(100, "George");
        room = new Room(1000, monster);
    }

    @Test
    public void getWeapon() {
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void getAttack() {
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void getTreasure() {
        assertEquals(0, dwarf.getTreasure());
    }

    @Test
    public void getName() {
        assertEquals("Mario", dwarf.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(75, dwarf.getHealth());
    }

    @Test
    public void addTreasure() {
        dwarf.addTreasure(room);
        assertEquals(1000, dwarf.getTreasure());
    }

    @Test
    public void removeHealth() {
        dwarf.removeHealth(25);
        assertEquals(50, dwarf.getHealth());
    }
}