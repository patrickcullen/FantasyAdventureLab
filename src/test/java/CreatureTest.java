import creatures.Creature;
import creatures.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Physical;
import weapons.Type;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Weapon axe;
    Troll troll;
    Physical player;

    @Before
    public void before(){
        axe = new Weapon(Type.AXE, Type.AXE.getAttackDamage());
        troll = new Troll();
        player = new Physical();
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, troll.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        troll.setHealthPoints(90);
        assertEquals(90, troll.getHealthPoints());
    }

    @Test
    public void trollStartsEmptyHanded(){
        assertEquals(false, troll.hasWeapon());
    }

    @Test
    public void canAddWeapon(){
        troll.addWeapon(axe);
        assertEquals(true, troll.hasWeapon());
    }

    @Test
    public void canSwapWeapon(){
        troll.addWeapon(axe);
        Weapon axe2 = new Weapon(Type.AXE, Type.AXE.getAttackDamage());
        troll.swapWeapon(axe2);
        assertEquals(axe2, troll.showWeapon());
    }

    @Test
    public void canAttack(){
        troll.addWeapon(axe);
        troll.attack(player);
        assertEquals(70, player.getHealthPoints());
    }

}
