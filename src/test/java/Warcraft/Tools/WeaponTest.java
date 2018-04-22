package Warcraft.Tools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    Weapon weapon1;


    @Before
    public void before(){
        weapon1 = new Weapon("The Widowmaker", 8);
    }

    @Test
    public void getWeaponPower() {
        assertEquals(8, weapon1.getWeaponPower());
    }
}