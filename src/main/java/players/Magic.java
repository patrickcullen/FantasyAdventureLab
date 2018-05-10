package players;

import creatures.Creature;
import spells.Spell;
import weapons.Weapon;

import java.util.ArrayList;

public class Magic extends Player{

    Set set;
    ArrayList<Spell> spellBook;
    ArrayList<Creature> protector;


    public Magic(String playersNameHere, Set set) {
        super(playersNameHere);
        this.set = set;
        spellBook = new ArrayList<>();
        protector = new ArrayList<>();

    }

    public Set getSet() {
        return set;
    }

    public void addSpell(Spell newSpell){
        this.spellBook.add(newSpell);
    }

    public void removeSpell(){
        this.spellBook.remove(0);
    }

    public void swapSpell(Spell newSpell){
        addSpell(newSpell);
        removeSpell();
    }

    public boolean hasSpell(){
        return (spellBook.size() > 0);
    }

    public Spell newSpell(){
        return spellBook.get(0);
    }

    public int getDamagePoints(){
        if (hasSpell()) {
            return spellBook.get(0).getAttackDamage();
        }
        return 0;
    }

    public void attack(Creature target){
        target.takeDamage(getDamagePoints());
    }

    public Creature getProtector() {
        return protector.get(0);
    }
    public void addProtector(Creature newCreature){
        this.protector.add(newCreature);
    }

    public void removeProtector(){
        this.protector.remove(0);
    }

    public void swapProtector(Creature creature){
        addProtector(creature);
        removeProtector();
    }

    public boolean hasProtector(){
        return (protector.size() > 0);
    }

    public Creature newProtector(){
        return protector.get(0);
    }

}
