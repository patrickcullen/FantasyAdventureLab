import org.junit.Before;
import org.junit.Test;
import players.Physical;
import players.Player;
import players.Set;
import treasure.Gem;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Physical physicalPlayer;
    Gem gem;

    @Before
    public void before(){
        physicalPlayer = new Physical("Andrew", Set.BARBARIAN, Set.BARBARIAN.getArmour());
        gem = new Gem();
    }

    @Test
    public void canGetName(){
        assertEquals("Andrew", physicalPlayer.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, physicalPlayer.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        physicalPlayer.setHealthPoints(110);
        assertEquals(110, physicalPlayer.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        physicalPlayer.takeDamage(30);
        assertEquals(70, physicalPlayer.getHealthPoints());
    }

    @Test
    public void lootStartsEmpty(){
        assertEquals(0, physicalPlayer.numberOfTreasures());
    }

    @Test
    public void canAddTreasure(){
        physicalPlayer.addTreasure(gem);
        assertEquals(1, physicalPlayer.numberOfTreasures());
    }

    @Test
    public void canRemoveTreasure(){
        physicalPlayer.addTreasure(gem);
        physicalPlayer.removeTreasure();
        assertEquals(0, physicalPlayer.numberOfTreasures());
    }

    @Test
    public void canReceiveHealing(){
        physicalPlayer.receiveHealing(30);
        assertEquals(130, physicalPlayer.getHealthPoints());
    }
}
