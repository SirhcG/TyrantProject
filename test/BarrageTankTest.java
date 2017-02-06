/*
 * This class test the functionality of the BarrageTank card whats unique about this card is that it has two abilities.
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
public class BarrageTankTest {
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost one = new AttackBoost("name", 30, 30);
    private final BarrageTank one1 = new BarrageTank("name", 40, 55);
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    @Test
    public void testSkillOne() {
        //Test to check if the cards ability is working properly. Skills one adds an armor ability and skills two damages the opponents field. 
        System.out.println("skillOne");
        
        val.add(one1);
        opponentHand.add(one);
        
        o.setCards(opponentHand);
        p.setCards(val);
        
        o.playCard(0);
        p.playCard(0);
        
        one1.skillOne(p, o);
        
        assertEquals(70, one1.getHealth()); //Armor skill adds an additional 15 health points to the base health. 
    }

    /**
     * Test of skillTwo method, of class BarrageTank.
     */
    @Test
    public void testSkillTwo() {
        System.out.println("skillTwo");
        
        val.add(one1);
        opponentHand.add(one);
        
        o.setCards(opponentHand);
        p.setCards(val);
        
        o.playCard(0);
        p.playCard(0);
        
        one1.skillTwo(p, o);
        
        assertEquals(15, one.getHealth()); // When using strikeboost the opponents card on the field will lost 15 health points.
       
       
    }
    
}
