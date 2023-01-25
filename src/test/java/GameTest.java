import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Monster monster;
    Room room;

    Game game;
    Player player;

    @Before
    public void setUp(){
        monster = new Monster(50, "George");
        room = new Room(1000, monster);
        game = new Game(room);
        player = new Barbarian(0, "Mario", 75, Weapon.SWORD);
    }

    @Test
    public void canAttackDoesntCompleteRoom(){
        game.performAttack(player);
        assertEquals(25, monster.getHealth());
        assertFalse(game.roomComplete());
        assertEquals(0, player.getTreasure());
    }

    @Test
    public void canAttackDoesCompleteRoom(){
        game.performAttack(player);
        game.performAttack(player);
        assertEquals(0, monster.getHealth());
        assertTrue(game.roomComplete());
        assertEquals(1000, player.getTreasure());
    }

    @Test
    public void roomAlreadyComplete(){
        monster.removeHealth(50);
        game.performAttack(player);
        assertEquals(0, monster.getHealth());
        assertTrue(game.roomComplete());
        assertEquals(0, player.getTreasure());
    }
}
