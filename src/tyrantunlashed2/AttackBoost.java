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
public class AttackBoost extends CardBase implements CardSkill{
    
    public AttackBoost(int Attack, int Health){
        super(Attack, Health);
    }
    
    @Override
    public void ability(Player p, Player o){
       int temp = this.getAttack();
       temp = temp + 10;
       this.setDamage(temp);
       }

    @Override
    public void checkSkill() {
        System.out.println("Cards Attack Boost skill will increase Attack by 10 points !! \n");
    }
    
}
