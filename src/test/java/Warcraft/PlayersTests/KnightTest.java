package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Knight;
import Warcraft.Tools.Tool;
import Warcraft.Tools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight1;
    Knight knight2;
    Tool tool1;
    Tool tool2;

    @Before
    public void before(){
        tool1 = new Weapon("Sword of Sorrow", 6);
        tool2 = new Weapon("The Widowmaker", 12);
        knight1 = new Knight("Sir Laurence of Codeclan", 50, tool1, 40);
        knight2 = new Knight("The Black Knight", 20, tool2, 50);
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
        knight1.changeTool(tool2);
        assertEquals("The Widowmaker", knight1.getTool().sayName());
    }


}