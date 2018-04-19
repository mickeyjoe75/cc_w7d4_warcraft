package Warcraft.AllPlayers.Fighters;

import Warcraft.Tools.Tool;

public class Dwarf extends Fighter {

    private String name;
    private int loot;
    private Tool tool;
    private int health;

    public Dwarf(String name, int loot, Tool tool, int health) {
        super(name, loot, tool, health);
    }
}
