package Warcraft.Tools;

public abstract class Tool {

    private String name;

    public Tool(String name){
        this.name = name;
    }

    public String sayName(){
        return this.name;
    }
}
