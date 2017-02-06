/*
    Class tests the functionality of the Berserk card.
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
public class BerserkTest {
    
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final Berserk one = new Berserk("name", 50, 30, 10);
    private final Berserk one1 = new Berserk("name", 5, 55, 25);
    private final Berserk one2 = new Berserk("name", 25, 15, 100);
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
  
    @Test
    public void testAbility() {
        //Test the permanent attack boost effect of berserk. Attack will always incease by the amount set during initilization.
        System.out.println("Ability Test");
       
        val.add(one);
        val.add(one1);
        val.add(one2);
        
        one.ability(p, o);
        one1.ability(p, o);
        one2.ability(p, o);
        
        assertEquals(60, one.getAttack());
        assertEquals(30, one1.getAttack());
        assertEquals(125, one2.getAttack()); 
        
        one2.ability(p, o);
        assertEquals(225, one2.getAttack()); // Shows that the boost is permamant and any use of the ability skill will further increase attack.
      
    }
    
}
