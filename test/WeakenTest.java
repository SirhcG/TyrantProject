/*
 * This Class is used to test the functionality of the Weaken card. 
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
public class WeakenTest {
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost one = new AttackBoost("name", 25, 30);
    private final AttackBoost one2 = new AttackBoost("name", 15, 30);
    private final Weaken one1 = new Weaken("name", 40, 55, 10);
    
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    @Test
    public void testAbility() {
        //This ability will trigger before the battle phase between two cards
        //One of the opponents cards chosen at random will lose a set amount 
        //of attack points during the battle phase the effect are permanent. 
        System.out.println("Ability Test");
        
        val.add(one1);
        opponentHand.add(one);
       
        
        p.setCards(val);
        o.setCards(opponentHand);
        
        p.playCard(0);
        o.playCard(0);
            
        one1.ability(p, o);
        
        assertEquals(15, one.getDamage()); //Attack stat is reduced by 10 points starting from 25.
        
        one1.ability(p, o);
        
        assertEquals(5, one.getDamage()); // Additional reduction of attack points. 
    }
    
}
