/*
    Class to test the functionailty of the Attack Boost card.
 */
package tyrantunlashed2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author planb
 */
public class AttackBoostTest {
    
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost one = new AttackBoost("name", 50, 30);
    private final AttackBoost one1 = new AttackBoost("name", 5, 55);
    private final AttackBoost one2 = new AttackBoost("name", 25, 15);
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    @Test
    public void testAbility() {
        System.out.println("Ability Test\n");
        //If the value stored in ability does not increase by 15 points the test will fail.
        //The differece in points represents an attack increase. 
        
        val.add(one);
        val.add(one1);
        val.add(one2);
        
        one.ability(p, o);
        one1.ability(p, o);
        one2.ability(p, o);
        
        assertEquals(65, one.getDamage());
        assertEquals(20, one1.getDamage());
        assertEquals(40, one2.getDamage());
       
    }

}
