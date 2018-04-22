package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Magicians.Warlock;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Warlock warlock1;
    Tool spell1;

    @Before
    public void before(){
        spell1 = new Tool("Mystic Canonball", 50);
        warlock1 = new Warlock("Nebu the Great", 3000, spell1, 100);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell1, warlock1.getTool());
    }

}