import org.junit.Before;
import org.junit.Test;
import spells.Spell;
import spells.SpellType;
import weapons.Type;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell fireball;
    Spell lightningStrike;

    @Before
    public void before(){
        fireball = new Spell(SpellType.FIREBALL, SpellType.FIREBALL.getAttackDamage());
        lightningStrike = new Spell(SpellType.LIGHTNINGSTRIKE, SpellType.LIGHTNINGSTRIKE.getAttackDamage());
    }

    @Test
    public void canGetType(){
        assertEquals(SpellType.FIREBALL, fireball.getType());
    }

    @Test
    public void canGetAttackDamage(){
        assertEquals(15, lightningStrike.getAttackDamage());
    }
}


