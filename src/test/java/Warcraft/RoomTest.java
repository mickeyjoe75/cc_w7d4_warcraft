package Warcraft;

import Warcraft.AllPlayers.Fighters.Knight;
import Warcraft.AllPlayers.Magicians.Warlock;
import Warcraft.Rooms.Room;
import Warcraft.Tools.Tool;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room1;
    Knight player1;
    Knight player2;
    Warlock warlock1;
    Tool weapon1;
    Tool weapon2;
    Tool spell1;

    @Before
    public void before(){
        room1 = new Room("Chamber of Spells");
        weapon1 = new Tool("Death axe", 25);
        player1 = new Knight("John", 100, weapon1, 100);
        weapon2 = new Tool("Death Whip", 30);
        player2 = new Knight("John", 100, weapon2, 90);
        spell1 = new Tool("Terrible Nightmare", 30);
        warlock1 = new Warlock("Alf", 300, spell1, 90);
        }

    @Test
    public void playersCanBattle(){
        room1.playersBattle(player1, player2);
        assertEquals(70,player1.getHealth());
        assertEquals(65,player2.getHealth());
    }

    @Test
    public void warlockCanBattle(){
        room1.playersBattle(warlock1, player2);
        assertEquals(60,warlock1.getHealth());
        assertEquals(60,player2.getHealth());
    }

}
