package players;

import creatures.Creature;
import weapons.Weapon;

import java.util.ArrayList;

public class Physical extends Player {

    Set set;
    int armour;
    ArrayList<Weapon> weaponBox;


    public Physical(String name, Set set, int armour) {
        super(name);
        this.set = set;
        this.armour = armour;
        weaponBox = new ArrayList<>();
    }

    public Set getSet() {
        return set;
    }

    public int getArmour() {
        return armour;
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

    public boolean hasWeapon(){
        return (weaponBox.size() > 0);
    }

    public Weapon showWeapon(){
        return weaponBox.get(0);
    }

    public int getDamagePoints(){
        if (hasWeapon()) {
            return weaponBox.get(0).getAttackDamage();
        }
        return 0;
    }

    public void attack(Creature target){
        target.takeDamage(getDamagePoints());
    }
}
