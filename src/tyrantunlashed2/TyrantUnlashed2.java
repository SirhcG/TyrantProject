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
        
        CardBase card0 = new AttackBoost(20, 30);
        CardBase card1 = new AttackBoost(20, 30);
        CardBase card2 = new AttackBoost(20, 30);
        
        ArrayList<CardBase> val = new ArrayList<>();
        
        val.add(card0);
        val.add(card1);
        val.add(card2);
        
        Player cg = new Player(100, 3);
        cg.setCards(val);
        
        card0 = new AttackBoost(20, 30);
        card1 = new AttackBoost(20, 30);
        card2 = new AttackBoost(20, 30);
        
        ArrayList<CardBase> opponentHand = new ArrayList<>() ;
        
        opponentHand.add(card0);
        opponentHand.add(card1);
        opponentHand.add(card2);
        
        Player opponent = new Player(100, 3);
        cg.setCards(opponentHand);
        
        
        System.out.println(one.getAttack());
        System.out.println(one.getHealth());
        one.checkSkill();
        one.ability(cg, opponent);
        System.out.println(one.getAttack());
        System.out.println();
       
        
        System.out.println(cg.getField().size());
        
        
        
      
    }
    
}
