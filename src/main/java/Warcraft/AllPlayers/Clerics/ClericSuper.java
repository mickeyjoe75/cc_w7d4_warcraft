package Warcraft.AllPlayers.Clerics;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Tool;

public abstract class ClericSuper extends Player {

    public ClericSuper(String name, int loot, Tool healthPotion, int health){
        super(name, loot, healthPotion, health);
    }
}
