package weapons;

public enum Type {

    SWORD(25),
    AXE(30),
    CLUB(10);

    private int attackDamage;
    Type (int attackDamage){
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}
