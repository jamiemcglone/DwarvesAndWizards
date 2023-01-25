import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MythicalCreatureTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Ogre", MythicalCreature.OGRE.getName());
        assertEquals("Dragon", MythicalCreature.DRAGON.getName());
    }

    @Test
    public void getProtection() {
        assertEquals(0.5, MythicalCreature.OGRE.getProtection(), 0.001);
        assertEquals(0.7, MythicalCreature.DRAGON.getProtection(), 0.001);
    }
}