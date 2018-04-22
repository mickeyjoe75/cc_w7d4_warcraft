package Warcraft.AllPlayers.Fighters;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Tool;

public abstract class Fighter extends Player {

    protected Tool weapon;

    public Fighter(String name, int loot, Tool weapon, int health){
        super(name, loot, weapon, health);
    }

}
