package Warcraft.AllPlayers.Magicians;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Tool;

public abstract class Magician extends Player {

    public Magician(String name, int loot, Tool spell, int health){
        super(name, loot, spell, health);
    }

}
