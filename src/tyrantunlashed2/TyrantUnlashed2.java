/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

import java.util.ArrayList;

import tyrantunlashed2.Player.StrategyType;

/**
 *
 * @author planb
 */
public class TyrantUnlashed2 {

   
    public static void main(String[] args) {
        
        AttackBoost one = new AttackBoost("name", 20, 30);
        
        AttackBoost card0 = new AttackBoost("name", 20, 30);
        ArmorBoost card1 = new ArmorBoost("name", 20, 30);
        StrikeBoost card2 = new StrikeBoost("name", 20, 30);
        
        /*
        CardBase empty = new Empty();
        
        
        ArrayList<CardBase> emptylist = new ArrayList<>();
        ArrayList<CardBase> emptylist2 = new ArrayList<>();

        
        emptylist.add(empty);
        emptylist.add(empty);
        emptylist.add(empty);
        
        emptylist2.add(empty);
        emptylist2.add(empty);
        emptylist2.add(empty);
        
        */
        
        ArrayList<CardBase> val = new ArrayList<>();
        
        val.add(card0);
        val.add(card1);
        val.add(card2);
        
        Player cg = new Player(100, 3, StrategyType.SIMPLE);
        cg.setCards(val);
        //cg.setField(emptylist);
        
        
        AttackBoost card3 = new AttackBoost("name", 20, 20);
        AttackBoost card4 = new AttackBoost("name", 20, 15);
        AttackBoost card5 = new AttackBoost("name", 20, 25);
        
        ArrayList<CardBase> opponentHand = new ArrayList<>() ;
        
        opponentHand.add(card3);
        opponentHand.add(card4);
        opponentHand.add(card5);
        
        Player opponent = new Player(100, 3, StrategyType.DEFENSIVE);
        opponent.setCards(opponentHand);
        //opponent.setField(emptylist2);
        opponent.setCheck();
        
        
        
        System.out.println("PLAYER HAND");
        System.out.println(cg.getHand());
        System.out.println("PLAYER FIELD");
        System.out.println(opponent.getHand());
        
        System.out.println("OPPONENT FIELD");
        System.out.println(cg.getField());
        System.out.println("PLAYER FIELD");
        System.out.println(opponent.getField());
        
        System.out.println(cg.strategy.nextMove()); //this prints out 0, because 0 is the first card that is playable usign the SIMPLE strategy
        System.out.println(opponent.strategy.nextMove()); //this prints out 2 because the position 2 card has the most health which is in line with the DEFENSIVE strategy
        
        Move move = new Move(0); //the 0 refers to the handindex of the card being played
        cg.doMove(move);
        move = new Move(0);
        opponent.doMove(move);
         
        
        System.out.println("PLAYER HAND");
        System.out.println(cg.getHand());
        System.out.println("PLAYER FIELD");
        System.out.println(opponent.getHand());
        
        
        System.out.println("OPPONENT FIELD");
        System.out.println(cg.getField());
        System.out.println("PLAYER FIELD");
        System.out.println(opponent.getField());
        
        
        
        /* the playCard() methods should be in player I think, since the player is playing the card.
        Move test = new Move(cg);
        Move test2 = new Move(opponen);
       
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
        
        */
        
      
    }
    
}
