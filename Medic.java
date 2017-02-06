
package tyrantunlashed2;


   
/*
* this is a card
* this card has 2 attack and 4 health
*this card has 1 skills, weaken(reduce the armor of target)
*/
public class Medic extends CardBase implements CardSkill {
    
      
   
    public Medic(String _name, int Attack, int Health) {
        super(_name, Attack, Health);
        
    }

// the first skill
//reduce the target's armor
    public void ability(Player p, Player o)
    {
      int temp = p.getCard(0).getHealth();
      temp = temp + 15;
      p.getCard(0).setHealth(temp);
      
      checkSkill(); 
    }

    @Override
    public void checkSkill() {
        System.out.println("Cards Medic ability skill will heal one unit by 15 health points!! \n");
    }
}
    

