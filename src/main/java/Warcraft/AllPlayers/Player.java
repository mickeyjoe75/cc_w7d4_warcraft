package Warcraft.AllPlayers;

import Warcraft.Tools.Tool;

public abstract class Player {

    private String name;
    private int loot;
    private Tool tool;

    public Player(String name, int loot, Tool tool) {
        this.name = name;
        this.loot = loot;
        this.tool = tool;
    }

    public String getName(){
        return this.name;
    }

    public int getLoot(){
        return this.loot;
    }

    public Tool getTool(){
        return this.tool;
    }

    public void changeTool(Tool newTool){
        this.tool = newTool;
    }

}
