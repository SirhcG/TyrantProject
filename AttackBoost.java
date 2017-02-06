/*
 * For this class I used the decorator design pattern to implements this cards special ability. Each child from CardBase has two methods which
 * are overloaded from the CardSkill interface allowing any child that implements CardSkill to share similar characteristics. 
 */
package tyrantunlashed2;

/**
 *
 * @author planb
 */
public class AttackBoost extends CardBase implements CardSkill{
    
    public AttackBoost(String _name, int Attack, int Health){
        super(_name, Attack, Health);
    }
    
    @Override
    public void ability(Player p, Player o){
       this.setDamage(0);
       int temp = this.getAttack();
       temp = temp + 15;
       this.setDamage(temp);
       
       checkSkill();
       }

    @Override
    public void checkSkill() {
        System.out.println("Cards Attack Boost skill will increase Attack by 10 points !! \n");
    }
    
}
