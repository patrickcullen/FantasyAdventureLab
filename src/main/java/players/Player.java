package players;

import treasure.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Treasure> loot;

    public Player(String playersNameHere) {
        this.name = playersNameHere;
        this.healthPoints = 100;
        this.loot = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damagePoints){
        this.healthPoints -= damagePoints;
    }

    public void addTreasure(Treasure newTreasure){
        this.loot.add(newTreasure);
    }

    public void removeTreasure(){
        this.loot.remove(0);
    }

    public void receiveHealing(int healthPoints){
        this.healthPoints += healthPoints;
    }

    public int numberOfTreasures(){
        return this.loot.size();
    }



}
