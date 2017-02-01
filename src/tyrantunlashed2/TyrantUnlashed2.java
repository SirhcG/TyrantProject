/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

/**
 *
 * @author planb
 */
public class TyrantUnlashed2 {

   
    public static void main(String[] args) {
        
        AttackBoost one = new AttackBoost(20, 30);
        CardBase[] val = {new AttackBoost(20, 30), new AttackBoost(20, 30), new AttackBoost(20, 30)};
        
        CardBase[] opponentHand = {new AttackBoost(20, 30), new AttackBoost(20, 30), new AttackBoost(20, 30)};
        Player opponent = new Player(100, 3);
        opponent.setCards(opponentHand);
        
        Player cg = new Player(100, 3);
        cg.setCards(val);
        
        System.out.println(one.getAttack());
        System.out.println(one.getHealth());
        one.checkSkill();
        one.ability(cg, opponent);
        System.out.println(one.getAttack());
        System.out.println();
       
        
        
        
        
        
        System.out.println(cg.checkSize());
        
        
        
      
    }
    
}
