package Warcraft.AllPlayers.Fighters;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Tool;

public abstract class Fighter extends Player {

    public Fighter(String name, int loot, Tool tool, int health){
        super(name, loot, tool, health);
    }

}
