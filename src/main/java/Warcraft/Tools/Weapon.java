package Warcraft.Tools;

public class Weapon extends Tool {

    int power;

    public Weapon(String name, int power){
        super(name);
        this.power = power;
    }

    public int getWeaponPower(){
        return this.power;
    }
}
