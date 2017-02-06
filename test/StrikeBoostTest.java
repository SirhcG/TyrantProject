/*
 * This Class tests the functionality of the StikeBoost card ability.
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
public class StrikeBoostTest {
    
    private final Player p = new Player("Player", 100, 3, Player.StrategyType.SIMPLE);
    private final Player o = new Player("Opponent", 40, 3, Player.StrategyType.DEFENSIVE);
    
    private final AttackBoost one = new AttackBoost("name", 30, 30);
    private final AttackBoost one2 = new AttackBoost("name", 20, 30);
    private final StrikeBoost one1 = new StrikeBoost("name", 40, 55);
    
    
    
    private final ArrayList<CardBase> val = new ArrayList<>();
    private final ArrayList<CardBase> opponentHand = new ArrayList<>();
    
    
    @Test
    public void testCheckSkill() {
        
        System.out.println("Ability Test");
       //Test to see if there is a card in play if not the opponent will be hit with a direct attack.
        val.add(one1);
        opponentHand.add(one);
        opponentHand.add(one2);
        
        p.setCards(val);
        o.setCards(opponentHand);
        
        
        p.playCard(0);
      
        
        System.out.println(o.getCardInField());
        
        one1.ability(p, o);
        assertEquals(25, o.getHealth());//Direct attack starting health was 40
        
       
    }
    
     @Test
    public void testCheckSkillOneCard() {
        
        System.out.println("Ability Test");
        //Test to see if their is a card in the opposing field if so the card on the opponents card in play will lose 15 health points. 
       
        val.add(one1);
        opponentHand.add(one);
        
        
        p.setCards(val);
        o.setCards(opponentHand);
        
        
        p.playCard(0);
        o.playCard(0);
      
        
        System.out.println(o.getCardInField());
        
        one1.ability(p, o);
        assertEquals(15, one.getHealth()); //Health of opponents card after the strike boost ability.
        
       
    }
    
}
