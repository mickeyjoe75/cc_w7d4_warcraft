package Warcraft.Rooms;

import Warcraft.AllPlayers.Player;

public class Room {

    private String name;
    private Player player1;
    private Player player2;
    private int damage;

    public Room(String name){
        this.name = name;
    }

    public void playersBattle(Player player1, Player player2){
      player1.decreaseHealth(10);
      player2.decreaseHealth(10);
    }
}
