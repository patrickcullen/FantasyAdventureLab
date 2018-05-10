package players;

public abstract class Player {

    private int healthPoints;

    public Player() {
        this.healthPoints = 100;
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
}
