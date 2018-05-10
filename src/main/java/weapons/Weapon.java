package weapons;

public class Weapon {

    private Type type;
    private int attackDamage;


    public Weapon(Type type, int attackDamage) {
        this.type = type;
        this.attackDamage = attackDamage;

    }

    public Type getType() {
        return type;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

}
