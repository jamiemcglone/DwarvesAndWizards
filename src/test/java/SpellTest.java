import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellTest {
    Monster monster;

    @Before
    public void setUp() throws Exception {
        monster = new Monster(100, "George");
    }

    @Test
    public void getName() {
        assertEquals("Fireball", Spell.FIREBALL.getName());
        assertEquals("Lightning Strike", Spell.LIGHTNING_STRIKE.getName());
    }

    @Test
    public void getMultiplier() {
        assertEquals(0.5, Spell.FIREBALL.getMultiplier(), 0.001);
        assertEquals(0.9, Spell.LIGHTNING_STRIKE.getMultiplier(), 0.001);
    }

    @Test
    public void doAttack() {
        Spell.FIREBALL.doAttack(monster);
        assertEquals(50, monster.getHealth());
        Spell.LIGHTNING_STRIKE.doAttack(monster);
        assertEquals(5, monster.getHealth());
    }
}