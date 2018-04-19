package Warcraft.AllPlayers.Fighters;

import Warcraft.Tools.Tool;

public class Knight extends Fighter {

    private String name;
    private int loot;
    private Tool tool;

    public Knight(String name, int loot, Tool tool){
        super(name, loot, tool);
    }
}
