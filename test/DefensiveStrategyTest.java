/*
 * This class tests the functionality of the DefensiveStrategy class.
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
public class DefensiveStrategyTest {
    
    
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost card3 = new AttackBoost("card4", 20, 20);
    private final AttackBoost card4 = new AttackBoost("card5", 20, 100);
    private final AttackBoost card5 = new AttackBoost("card6", 20, 200);
    
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    @Test
    public void EmptyHand() {
        //Check to see if a move is return with an empty hand.
         DefensiveStrategy opponent = new DefensiveStrategy(o);
         assertEquals(null, opponent.nextMove()); 
         }
    
    
    
    @Test
    public void highestDefense(){
        //The move object will store the index of the card with the highest defense to be played onto the field
        opponentHand.add(card3);
        opponentHand.add(card4);
        opponentHand.add(card5);
        
        o.setCards(opponentHand);
        DefensiveStrategy opponent = new DefensiveStrategy(o);
        Move check = new Move(0);
        check = opponent.nextMove();//index 2 has a defense of 200 which is the right move.
        
        assertEquals("2", check.toString());
    }
    
}
