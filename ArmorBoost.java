/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

/**
 * For this class I used the decorator design pattern to implements this cards special ability. Each child from CardBase has two methods which
 * are overloaded from the CardSkill interface allowing any child that implements CardSkill to share similar characteristics. 
 * @author planb
 */
public class ArmorBoost extends CardBase implements CardSkill {
    
    private int Armor; 
    
    public ArmorBoost(String _name, int Attack, int Health){
        super(_name, Attack, Health);
        this.Armor = 15;
    }
    
     @Override
     //Cards ability boosts health points by a set amount.
    public void ability(Player p, Player o) {
        int temp = this.getHealth();
        temp = temp + 15;
        this.setHealth(temp);
        
        checkSkill();
    }
    
  
    @Override
    //Allows players to see if a card has an ability or not. 
    public void checkSkill() {
        System.out.println("Cards Armor skill will increase Hp by 15 points !! \n");
    }

   
    
}