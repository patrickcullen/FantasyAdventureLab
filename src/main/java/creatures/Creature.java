package creatures;

import players.Player;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Creature {

    private int healthPoints;
    private ArrayList<Weapon> weaponBox;

    public Creature() {
        this.healthPoints = 100;
        this.weaponBox = new ArrayList<>();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addWeapon(Weapon newWeapon){
        this.weaponBox.add(newWeapon);
    }

    public void removeWeapon(){
        this.weaponBox.remove(0);
    }

    public void swapWeapon(Weapon newWeapon){
        addWeapon(newWeapon);
        removeWeapon();
    }

    public int getDamagePoints(){
        if (hasWeapon()) {
            return weaponBox.get(0).getAttackDamage();
        }
        return 0;
    }

    public void attack(Player target){
        target.takeDamage(getDamagePoints());
    }

    public boolean hasWeapon(){
        return (weaponBox.size() > 0);
    }

    public Weapon showWeapon(){
        return weaponBox.get(0);
    }

}
