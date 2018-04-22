package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Barbarian;
import Warcraft.Tools.Tool;
import Warcraft.Tools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Barbarian barbarian2;
    Tool tool1;
    Tool tool2;

    @Before
    public void before(){
        tool1 = new Weapon("Death Hammer", 11);
        tool2 = new Weapon("Skull Crusher", 9);
        barbarian1 = new Barbarian("Val the Great", 58, tool1, 80);
        barbarian2 = new Barbarian("Shal the Great", 100, tool2, 70);
    }

    @Test
    public void hasName(){
        assertEquals("Val the Great", barbarian1.getName());
    }

    @Test
    public void hasLoot(){
        assertEquals(100, barbarian2.getLoot());
    }

    @Test
    public void canChangeTool(){
        barbarian1.changeTool(tool2);
        assertEquals("Skull Crusher", barbarian1.getTool().sayName());
    }

}