package Warcraft.AllPlayers.Fighters;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Tool;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<Tool> tools;
    private Tool tool;

    public Fighter(String name, int loot, Tool tool){
        super(name, loot, tool);
    }

}
