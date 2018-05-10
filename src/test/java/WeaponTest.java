import org.junit.Before;
import org.junit.Test;
import weapons.Type;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon axe;
    Weapon sword;
    Weapon club;

    @Before
    public void before(){
        axe = new Weapon(Type.AXE, Type.AXE.getAttackDamage());
        sword = new Weapon(Type.SWORD, Type.SWORD.getAttackDamage());
        club = new Weapon(Type.CLUB, Type.CLUB.getAttackDamage());
    }

    @Test
    public void canGetType(){
        assertEquals(Type.AXE, axe.getType());
    }

    @Test
    public void canGetAttackDamage(){
        assertEquals(10, club.getAttackDamage());
    }
}
