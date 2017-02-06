/*
 * This class is used to test the functionality of the medic card.
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
 * @author leo
 */
public class MedicTest {
    
     private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost one = new AttackBoost("name", 30, 30);
    private final AttackBoost one2 = new AttackBoost("name", 20, 30);
    private final Medic one1 = new Medic("name", 40, 55);
    
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    
    @Test
    public void testCheckSkill() {
        //Tests if a card will gain an additional 15 health points once the card skill is activated.
        //Addtonal health is a permanant boost lasting for the life of the card. 
        
        val.add(one);
        val.add(one1);
        opponentHand.add(one2);
        
        p.setCards(val);
        o.setCards(opponentHand);
        
        p.playCard(0);
        p.playCard(0);
        
        
        o.playCard(0);
        
        one1.ability(p, o);
        
        assertEquals(45, one.getHealth()); // A card on my side gained 15 health points.
        
        one1.ability(p, o);
        
        assertEquals(60, one.getHealth()); // Adding an additional 15 points.
    }
    
}
