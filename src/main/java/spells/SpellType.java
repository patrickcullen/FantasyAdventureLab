package spells;

public enum SpellType {
    FIREBALL(35),
    LIGHTNINGSTRIKE(15);

    private int attackDamage;
    SpellType (int attackDamage){
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}
