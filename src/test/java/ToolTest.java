import org.junit.Before;
import org.junit.Test;
import tools.Herb;
import tools.Potion;

import static org.junit.Assert.assertEquals;

public class ToolTest {

    Potion magicPotion;
    Herb magicHerb;

    @Before
    public void before(){
        magicPotion = new Potion();
        magicHerb = new Herb();
    }

    @Test
    public void canGetRecoveryPointsPotion(){
        assertEquals(30, magicPotion.getHealthRecoveryPoints());
    }

    @Test
    public void canGetRecoveryPointsHerb(){
        assertEquals(15, magicHerb.getHealthRecoveryPoints());
    }
}
