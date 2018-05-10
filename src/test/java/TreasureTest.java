import org.junit.Before;
import org.junit.Test;
import treasure.Gem;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Gold goldcoin;
    Gem gem;

    @Before
    public void before(){
        goldcoin = new Gold();
        gem = new Gem();
    }

    @Test
    public void canGetGoldValue(){
        assertEquals(1, goldcoin.getValue());
    }

    @Test
    public void canGetGemValue(){
        assertEquals(10,gem.getValue());
    }
}
