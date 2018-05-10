package tools;

public class Potion extends Tool {

    private int healthRecoveryPoints;

    public Potion() {
        this.healthRecoveryPoints = 30;
    }

    public int getHealthRecoveryPoints() {
        return healthRecoveryPoints;
    }
}
