package players;

public enum Set {

    KNIGHT(25),
    BARBARIAN(10),
    DWARF(5);

    private int armour;
    Set (int armour){
        this.armour = armour;
    }

    public int getArmour(){
        return this.armour;
    }
}
