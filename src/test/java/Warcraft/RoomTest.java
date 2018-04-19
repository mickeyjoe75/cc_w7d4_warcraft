package Warcraft;

import Warcraft.AllPlayers.Fighters.Knight;
import Warcraft.Rooms.Room;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room1;
    Knight player1;
    Knight player2;
    Tool tool1;
    Tool tool2;

    @Before
    public void before(){
        room1 = new Room("Chamber of Spells");
        tool1 = new Tool("Death axe");
        player1 = new Knight("John", 100, tool1, 100);
        tool2 = new Tool("Death Whip");
        player2 = new Knight("John", 100, tool2, 90);
        }

    @Test
    public void playersCanBattle(){
        room1.playersBattle(player1, player2);
        assertEquals(90,player1.getHealth());
        assertEquals(80,player2.getHealth());
    }


}
