/*
 * Class tests the functionality of the Leech card.
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
public class LeechTest {
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final Leech one = new Leech("name", 25, 30, 40);
    private final Leech one1 = new Leech("name", 15, 55, 10);
    
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    
    @Test
    public void testAbility() {
        System.out.println("Ability Test");
        //This ability will take place during the damage calculation phase.
        //If leech is greater than a cards attack the attack value will be added to the health 
        //otherwise if leech is less than attack the default leech value will be added to the health.
        
        val.add(one);
        val.add(one1);
        
        one.ability(p, o);
        one1.ability(p, o);
        
        assertEquals(55, one.getHealth()); // Leech value greater than attack so the result it Attack + Health.
        assertEquals(65, one1.getHealth()); // Leech vlaue is less than attack so the result is Health + Leech
    }
    
}
