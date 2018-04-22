package Warcraft.AllPlayers.Fighters;

import Warcraft.AllPlayers.Player;
import Warcraft.Tools.Weapon;

public abstract class Fighter extends Player {

    protected Weapon weapon;

    public Fighter(String name, int loot, Weapon weapon, int health){
        super(name, loot, weapon, health);
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

}
