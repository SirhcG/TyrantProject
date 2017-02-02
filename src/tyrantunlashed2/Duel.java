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
public abstract class Duel {
    private Player one;
    private Player two;
    //private Move test;
    //private Move test2;
    
    public Duel(Player one, Player two/*, Move a, Move b*/){
        this.one = one;
        this.two = two;
       //this.test = a;
        //this.test2 = b;
    }
    
   public void Battle(){
       for(int i=0; i<one.getCardInField(); i++){
           
           int index = 0;
           if(one.getCard(i) instanceof AttackBoost){
               one.getCard(i).ability(one, two);
               int dmg = one.getCard(i).getDamage();
               int health = two.getCard(index).getHealth();
               int val = health - dmg;
               two.getCard(index).setHealth(val);
               index++;
               }
           else if(one.getCard(i) instanceof ArmorBoost){
               one.getCard(i).ability(one, two);
               int dmg = one.getCard(i).getDamage();
               int health = two.getCard(i).getHealth();
               int val = health - dmg;
               two.getCard(i).setHealth(health);
               index++;
               }
           else if(one.getCard(i) instanceof StrikeBoost){
               one.getCard(i).ability(one, two);
               int dmg = one.getCard(i).getDamage();
               int health = two.getCard(i).getHealth();
               int val = health - dmg;
               two.getCard(i).setHealth(health);
               index++;
               }
           else if(one.getCard(i) instanceof Leech){
               one.getCard(i).ability(one, two);
               int dmg = one.getCard(i).getDamage();
               int health = two.getCard(i).getHealth();
               int val = health - dmg;
               two.getCard(i).setHealth(health);
               index++;
           }
             
           
       }
   }
   
   public void OppBattle(){
       for(int i=0; i<two.getCardInField(); i++){
           
           int index = 0;
           if(two.getCard(i) instanceof AttackBoost){
               two.getCard(i).ability(one, two);
               int dmg = two.getCard(i).getDamage();
               int health = one.getCard(index).getHealth();
               int val = health - dmg;
               one.getCard(index).setHealth(val);
               index++;
               }
           else if(two.getCard(i) instanceof ArmorBoost){
               two.getCard(i).ability(one, two);
               int dmg = two.getCard(i).getDamage();
               int health = one.getCard(i).getHealth();
               int val = health - dmg;
               one.getCard(i).setHealth(health);
               index++;
               }
           else if(two.getCard(i) instanceof StrikeBoost){
               two.getCard(i).ability(one, two);
               int dmg = two.getCard(i).getDamage();
               int health = one.getCard(i).getHealth();
               int val = health - dmg;
               one.getCard(i).setHealth(health);
               index++;
               }
           else if(two.getCard(i) instanceof Leech){
               two.getCard(i).ability(one, two);
               int dmg = two.getCard(i).getDamage();
               int health = one.getCard(i).getHealth();
               int val = health - dmg;
               one.getCard(i).setHealth(health);
               index++;
               
           }
             
           
       }
   }
   
   public void CheckHealth(Player x){
       for(int i=0;i<x.getCardInField(); i++){
           int Health = x.getCard(i).getHealth();
           if(Health < 0){
           x.remove(i);
           x.removePosition();
           x.removeCard();
           }
       }
   }
    
}
