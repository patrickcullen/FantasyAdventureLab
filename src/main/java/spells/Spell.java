package spells;

public class Spell {
    private SpellType spellType;
    private int attackDamage;


    public Spell(SpellType spellType, int attackDamage) {
        this.spellType = spellType;
        this.attackDamage = attackDamage;

    }

    public SpellType getType() {
        return spellType;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
