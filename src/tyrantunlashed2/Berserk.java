/*
 * For this class I used the decorator design pattern to implements this cards special ability. Each child from CardBase has two methods which
 * are overloaded from the CardSkill interface allowing any child that implements CardSkill to share similar characteristics. 
 */

package tyrantunlashed2;

public class Berserk extends CardBase implements CardSkill{

	int berserk;
	
	public Berserk(String _name, int Attack, int Health, int _berserk){
        super(_name, Attack, Health);
        this.berserk = _berserk;
    }
	
	@Override
	public void checkSkill() {
        System.out.println("When this unit deals attack damage, Attack is permanently boosted.\n");
    }
	
	@Override
	public void ability(Player p, Player o) { //ability triggers before card attacks
		setAttack(getAttack()+berserk);
		
		checkSkill();
	}
}