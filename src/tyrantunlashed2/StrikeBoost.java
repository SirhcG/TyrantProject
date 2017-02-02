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
public class StrikeBoost extends CardBase implements CardSkill {
        
    
    private int baseStrike;
    
    public StrikeBoost(int Attack, int Health){
        super(Attack, Health);
        this.baseStrike = 15;
    }
    
     @Override
    public void ability(Player p, Player o) {
        
    }
    
    
    @Override
    public void checkSkill() {
        System.out.println("Cards Strike Boost skill will randomly damage an oponents card!!\n");
    }

   
    
    
    
}
