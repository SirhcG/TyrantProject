/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tyrantunlashed2;
/*
* this is a card
* this card has 3 attack and 5 health
*this card has 2 skills, strickboost and armorboost
*/
public class BarrageTank extends CardBase {
    
   private int armor;
   private int baseStrike;
   
//to set the health and attack, furthermore, set the name of card
    public BarrageTank(String _name, int attack, int health)
    {
        
        super(_name, attack, health);
        this.armor = 15;
        this.baseStrike = 15;
        
    }
// the first skill
//random strick a card
    public void skillOne(Player p, Player o)
    {
        
        int temp = this.getHealth();
        temp = temp + 15;
        this.setHealth(temp);
        
       
    }
    
// the second skill
//give extra armor
    public void skillTwo(Player p, Player o)
    {
         Player one = p;
        Player two = o;
        
        int val = o.getCardInField();
        if(val == 0){
           int temp = o.getHealth() - baseStrike;
           o.setHealth(temp);
        }
        else if(val == 1){
            int temp = o.getCard(val-1).getHealth();
            temp = temp - 15;
            o.getCard(val-1).setHealth(temp);
        }
        else if(val > 1){
            int temp = o.getCard(val - 1).getHealth();
            temp = temp - 15;
            o.getCard(val - 1).setHealth(temp);
            
        }
        
       
    }
    

}