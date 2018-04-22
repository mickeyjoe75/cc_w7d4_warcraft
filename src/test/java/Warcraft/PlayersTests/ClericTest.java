package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Clerics.Cleric;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric1;
    Tool healthPotion1;

    @Before
    public void before(){
        healthPotion1 = new Tool("Healing Herbs", 50);
        cleric1 = new Cleric("Cedric the Cleric", 8000, healthPotion1, 100);
    }

    @Test
    public void hasHealingPotion(){
        assertEquals(healthPotion1, cleric1.getTool());
    }

}