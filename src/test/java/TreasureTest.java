import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Gold goldcoin;

    @Before
    public void before(){
        goldcoin = new Gold(1);
    }

    @Test
    public void canGetValue(){
        assertEquals(1, goldcoin.getValue());
    }
}
