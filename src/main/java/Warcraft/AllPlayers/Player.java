package Warcraft.AllPlayers;

import Warcraft.Tools.Tool;

public abstract class Player {

    private String name;
    private int loot;
    protected Tool tool;
    private int health;
    private int damage;

    public Player(String name, int loot, Tool tool, int health) {
        this.name = name;
        this.loot = loot;
        this.tool = tool;
        this.health = health;
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

    public int decreaseHealth(int damage){
        return this.health -= damage;
    }

    public int getHealth(){
        return this.health;
    }


}
