package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Knight;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight1;
    Knight knight2;
    Tool weapon1;
    Tool weapon2;

    @Before
    public void before(){
        weapon1 = new Tool("Sword of Sorrow", 6);
        weapon2 = new Tool("The Widowmaker", 12);
        knight1 = new Knight("Sir Laurence of Codeclan", 50, weapon1, 40);
        knight2 = new Knight("The Black Knight", 20, weapon2, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Laurence of Codeclan", knight1
                .getName());
    }

    @Test
    public void hasLoot(){
        assertEquals(20, knight2.getLoot());
    }

    @Test
    public void canChangeTool(){
        knight1.changeTool(weapon2);
        assertEquals("The Widowmaker", knight1.getTool().sayName());
    }


}