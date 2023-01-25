import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Player player;

    @Before
    public void setUp(){
        cleric = new Cleric(0, "Bones", 10, HealingTool.FOOD);
        player = new Barbarian(0, "Mario", 75, Weapon.SWORD);
        player.removeHealth(25);
    }

    @Test
    public void inventoryStartsAt0(){
        assertEquals(0, cleric.getInventoryForHealingTool(HealingTool.FOOD));
        assertEquals(0, cleric.getInventoryForHealingTool(HealingTool.POTION));
    }

    @Test
    public void canAddToInventory(){
        cleric.addToInventory(HealingTool.FOOD, 10);
        assertEquals(10, cleric.getInventoryForHealingTool(HealingTool.FOOD));
        cleric.addToInventory(HealingTool.POTION, 1);
        assertEquals(1, cleric.getInventoryForHealingTool(HealingTool.POTION));
    }

    @Test
    public void takeOneFromInventoryReturnsFalse(){
        assertFalse(cleric.takeOneFromInventory(HealingTool.FOOD));
        assertFalse(cleric.takeOneFromInventory(HealingTool.POTION));
    }

    @Test
    public void takeOneFromInventoryReturnsTrue(){
        cleric.addToInventory(HealingTool.FOOD, 10);
        cleric.addToInventory(HealingTool.POTION, 1);
        assertTrue(cleric.takeOneFromInventory(HealingTool.FOOD));
        assertTrue(cleric.takeOneFromInventory(HealingTool.POTION));
    }

    @Test
    public void cannotHealWithoutInventory(){
        assertEquals("Out of inventory", cleric.doAttack(player));
        assertEquals(50, player.getHealth());
    }

    @Test
    public void canHealWithFood(){
        cleric.addToInventory(HealingTool.FOOD, 10);
        cleric.doAttack(player);
        assertEquals(60, player.getHealth());
        assertEquals(9, cleric.getInventoryForHealingTool(HealingTool.FOOD));
    }

    @Test
    public void canHealWithPotion(){
        cleric.addToInventory(HealingTool.POTION, 1);
        cleric.setCurrentTool(HealingTool.POTION);
        cleric.doAttack(player);
        assertEquals(75, player.getHealth());
        assertEquals(0, cleric.getInventoryForHealingTool(HealingTool.POTION));
    }



}
