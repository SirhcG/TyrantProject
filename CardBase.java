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
public class CardBase {
    
    private int baseAttack;
    private int baseHealth;
    private int damage;
    
    public CardBase(int Attack, int Health){
        
        this.baseAttack = Attack;
        this.baseHealth = Health;
    }
    
    public void setAttack(int Attack){
        this.baseAttack = Attack;
    }
    
    public void setDamage(int _damage){
    	damage = _damage;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public void setHealth(int Health){
        this.baseHealth = Health;
    }
    
    public int getHealth(){
        return this.baseHealth;
    }
    
    public int getAttack(){
        return this.baseAttack;
    }
    
   public void ability(Player one, Player two){
       // child classes will overload this.
   }
    
    @Override
     public String toString(){
        return("Attack " + getAttack() + " Health " + getHealth());
    }
   
}
