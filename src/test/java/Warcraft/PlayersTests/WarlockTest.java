package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Dwarf;
import Warcraft.AllPlayers.Magicians.Warlock;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Warlock warlock1;
    Tool spell1;
    Tool spell2;
    Dwarf dwarf1;
    Tool weapon1;

    @Before
    public void before(){
        spell1 = new Tool("Mystic Canonball", 50);
        spell2 = new Tool("Biblical Plague", 40);
        warlock1 = new Warlock("Nebu the Great", 3000, spell1, 100);
        weapon1 = new Tool("Sword of Sorrow", 40);
        dwarf1 = new Dwarf("Shorty of Codeclan", 50, weapon1, 100);
    }


    @Test
    public void hasSpell(){
        assertEquals(spell1, warlock1.getTool());
    }

    @Test
    public void canChangeTool() {
        warlock1.changeTool(spell2);
        assertEquals("Biblical Plague", warlock1.getTool().sayName());
    }

}

