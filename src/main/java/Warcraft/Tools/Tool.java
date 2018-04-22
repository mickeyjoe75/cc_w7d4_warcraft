package Warcraft.Tools;

public class Tool {

    private String name;
    protected int power;

    public Tool(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String sayName(){
        return this.name;
    }

    public int getPower(){
        return this.power;
    }
}
