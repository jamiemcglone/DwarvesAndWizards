import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Monster monster;
    Room room;

    @Before
    public void setUp() {
        wizard = new Wizard(0, "Gandalf", 40, Spell.FIREBALL, MythicalCreature.OGRE);
        monster = new Monster(100, "George");
        room = new Room(1000, monster);
    }

    @Test
    public void getSpell() {
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void setSpell() {
        wizard.setSpell(Spell.LIGHTNING_STRIKE);
        assertEquals(Spell.LIGHTNING_STRIKE, wizard.getSpell());
    }

    @Test
    public void getAttack() {
        assertEquals(Spell.FIREBALL, wizard.getAttack());
    }

    @Test
    public void getTreasure() {
        assertEquals(0, wizard.getTreasure());
    }

    @Test
    public void getName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(40, wizard.getHealth());
    }

    @Test
    public void addTreasure() {
        wizard.addTreasure(room);
        assertEquals(1000, wizard.getTreasure());
    }

    @Test
    public void removeHealth() {
        wizard.removeHealth(25);
        assertEquals(27, wizard.getHealth());
    }
}