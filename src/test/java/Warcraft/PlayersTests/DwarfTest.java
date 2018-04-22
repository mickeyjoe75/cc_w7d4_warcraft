package Warcraft.PlayersTests;

import Warcraft.AllPlayers.Fighters.Barbarian;
import Warcraft.AllPlayers.Fighters.Dwarf;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {

    Dwarf dwarf1;
    Dwarf dwarf2;
    Tool weapon1;
    Tool weapon2;
    Barbarian barbarian1;

    @Before
    public void before() {
        weapon1 = new Tool("Sword of Sorrow", 40);
        weapon2 = new Tool("The Widowmaker", 35);
        dwarf1 = new Dwarf("Shorty of Codeclan", 50, weapon1, 100);
        dwarf2 = new Dwarf("The Grey Dwarf", 20, weapon2, 80);
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
        dwarf1.changeTool(weapon2);
        assertEquals("The Widowmaker", dwarf1.getTool().sayName());
    }

//    @Test
//    public void canGetAttacked(){
//        dwarf1.getAttacked();
//        assertEquals(60, dwarf1.getHealth());
//    }

    @Test
    public void canGetWeaponPower(){
        assertEquals(40, dwarf1.getToolPower());
    }

}