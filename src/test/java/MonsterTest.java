import static org.junit.Assert.*;

public class MonsterTest {

    Monster monster;

    @org.junit.Before
    public void setUp() throws Exception {
        monster = new Monster(100, "George");
    }

    @org.junit.Test
    public void getHealth() {
        assertEquals(100, monster.getHealth());
    }

    @org.junit.Test
    public void getName() {
        assertEquals("George", monster.getName());
    }

    @org.junit.Test
    public void removeHealth() {
        monster.removeHealth(50);
        assertEquals(50, monster.getHealth());
    }

    @org.junit.Test
    public void resetMonster() {
        monster.removeHealth(50);
        monster.resetMonster();
        assertEquals(100, monster.getHealth());
    }

}