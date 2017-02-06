/*
 * This class is used to test the functionality of the Armor card.
 */
package tyrantunlashed2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class ArmorBoostTest {
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final ArmorBoost one = new ArmorBoost("name", 20, 30);
    private final ArmorBoost one1 = new ArmorBoost("name", 20, 55);
    private final ArmorBoost one2 = new ArmorBoost("name", 20, 15);
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    
    
    @Test
    public void testAbility() {
        
        //The change will take place in the cards health value if the value was not increased by 15 points the test will fail.
        //The difference in points represnts an armor boost.
        System.out.println("Ability Test\n");
        
        val.add(one);
        val.add(one1);
        val.add(one2);
        
        one.ability(p, o);
        one1.ability(p, o);
        one2.ability(p, o);
        assertEquals(45, one.getHealth()); //base health was 30
        assertEquals(70, one1.getHealth()); //base health was 55
        assertEquals(30, one2.getHealth()); //base health was 15
        
        }

   
    
}
