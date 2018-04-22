package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Barbarian;
import Warcraft.AllPlayers.Fighters.Dwarf;
import Warcraft.Tools.Tool;
import Warcraft.Tools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {

    Dwarf dwarf1;
    Dwarf dwarf2;
    Tool tool1;
    Tool tool2;
    Barbarian barbarian1;

    @Before
    public void before() {
        tool1 = new Weapon("Sword of Sorrow", 10);
        tool2 = new Weapon("The Widowmaker", 8);
        dwarf1 = new Dwarf("Shorty of Codeclan", 50, tool1, 100);
        dwarf2 = new Dwarf("The Grey Dwarf", 20, tool2, 80);
    }

    @Test
    public void hasName() {
        assertEquals("Shorty of Codeclan", dwarf1
                .getName());
    }

    @Test
    public void hasLoot() {
        assertEquals(20, dwarf2.getLoot());
    }

    @Test
    public void canChangeTool() {
        dwarf1.changeTool(tool2);
        assertEquals("The Widowmaker", dwarf1.getTool().sayName());
    }

    @Test
    public void canDecreaseHealth(){
        dwarf1.decreaseHealth(10);
        assertEquals(90, dwarf1.getHealth());
    }

//    @Test
//    public void canGetWeapon(){
//        dwarf1.getWeapon();
//    }


}