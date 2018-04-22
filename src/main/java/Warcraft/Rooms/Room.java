package Warcraft.Rooms;

import Warcraft.AllPlayers.Player;

public class Room {

    private String name;
    private Player player1;
    private Player player2;

    public Room(String name){
        this.name = name;
    }

    public void playersBattle(Player player1, Player player2){
      player1.getAttacked(player2.getToolPower());
      player2.getAttacked(player1.getToolPower());
    }

    public void playerHealsAnother(Player player1, Player player2){
        player2.getHealed(player1.getToolPower());
    }

}
