import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    Barbarian barbarian;

    @Before
    public void setUp(){
        barbarian = new Barbarian(0, "Mario", 75, Weapon.SWORD);
    }

    @Test
    public void canHealWithFood(){
        barbarian.removeHealth(25);
        HealingTool.FOOD.doHeal(barbarian);
        assertEquals(60, barbarian.getHealth());
    }

    @Test
    public void canHealWithPotion(){
        barbarian.removeHealth(50);
        HealingTool.POTION.doHeal(barbarian);
        assertEquals(75, barbarian.getHealth());
    }
}
