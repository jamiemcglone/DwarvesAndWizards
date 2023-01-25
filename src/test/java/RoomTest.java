import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Monster monster;
    private Room room;

    @Before
    public void setUp() throws Exception {
        monster = new Monster(100, "George");
        room = new Room(1000, monster);
    }

    @Test
    public void getTreasure() {
        assertEquals(1000, room.getTreasure());
    }

    @Test
    public void getMonster() {
        assertEquals(monster, room.getMonster());
    }

    @Test
    public void resetRoom() {
        monster.removeHealth(50);
        room.resetRoom();
        assertEquals(100, monster.getHealth());
    }
}