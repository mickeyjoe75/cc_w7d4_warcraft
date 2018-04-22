package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Barbarian;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Barbarian barbarian2;
    Tool weapon1;
    Tool weapon2;

    @Before
    public void before(){
        weapon1 = new Tool("Death Hammer", 11);
        weapon2 = new Tool("Skull Crusher", 9);
        barbarian1 = new Barbarian("Val the Great", 58, weapon1, 80);
        barbarian2 = new Barbarian("Shal the Great", 100, weapon2, 70);
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
        barbarian1.changeTool(weapon2);
        assertEquals("Skull Crusher", barbarian1.getTool().sayName());
    }

}