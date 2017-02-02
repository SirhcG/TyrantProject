/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

import java.util.ArrayList;

/**
 *
 * @author planb
 */
public class TyrantUnlashed2 {

   
    public static void main(String[] args) {
        
        AttackBoost one = new AttackBoost(20, 30);
        
        AttackBoost card0 = new AttackBoost(20, 30);
        ArmorBoost card1 = new ArmorBoost(20, 30);
        StrikeBoost card2 = new StrikeBoost(20, 30);
        
        CardBase empty = new CardBase(0,0);
        
        ArrayList<CardBase> emptylist = new ArrayList<>();
        ArrayList<CardBase> emptylist2 = new ArrayList<>();
        
        emptylist.add(empty);
        emptylist.add(empty);
        emptylist.add(empty);
        
        emptylist2.add(empty);
        emptylist2.add(empty);
        emptylist2.add(empty);
        
        
        
        ArrayList<CardBase> val = new ArrayList<>();
        
        val.add(card0);
        val.add(card1);
        val.add(card2);
        
        Player cg = new Player(100, 3);
        cg.setCards(val);
        cg.setField(emptylist);
        
        
       AttackBoost card3 = new AttackBoost(20, 20);
       AttackBoost card4 = new AttackBoost(20, 15);
       AttackBoost card5 = new AttackBoost(20, 25);
        
        ArrayList<CardBase> opponentHand = new ArrayList<>() ;
        
        opponentHand.add(card3);
        opponentHand.add(card4);
        opponentHand.add(card5);
        
        Player opponent = new Player(100, 3);
        opponent.setCards(opponentHand);
        opponent.setField(emptylist2);
        opponent.setCheck();
        
        
        Move test = new Move(cg);
        Move test2 = new Move(opponent);
       
        test.playCard();
        test.playCard();
        test.playCard();
        
        test2.playCard();
        test2.playCard();
        test2.playCard();
        
        Battle x = new Battle(cg, opponent , test, test2);
        x.Battle();
        x.OppBattle();
        x.Battle();
        x.OppBattle();
       // x.Battle();
        //x.OppBattle();
        x.CheckHealth(cg);
        x.CheckHealth(opponent);
       
        
        
         
        System.out.println(cg.getField());
        System.out.println(cg.getHand());
        System.out.println(cg.getHealth());
        System.out.println();
        
        
        System.out.println(opponent.getField());
        System.out.println(opponent.getHand());
        System.out.println(opponent.getHealth());
        
        
        
        
        
        
        
     
        
        
        
        
        
        
       
        
       
        
        
        
      
    }
    
}
