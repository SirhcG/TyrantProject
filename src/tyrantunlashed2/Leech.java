
package tyrantunlashed2;

/**
 *This class is a child of cardbase and uses the decorator pattern for the cards ability. The decorator pattern allows us to create
 * many instances of cards while still keeping a similarity between them. 
 * @author Danny Huang
 */
public class Leech extends CardBase implements CardSkill{
	
	int leech;
	
	public Leech(String _name, int Attack, int Health, int _leech){
        super(_name, Attack, Health);
        this.leech = _leech;
    }
	
	@Override
    public void checkSkill() {
        System.out.println("Leech heals this card as it deals Attack damage to an Assault card.\n");
    }
	
	@Override
	public void ability(Player p, Player o) { //ability triggers before card attacks
		int temp = getHealth();
		
		if(leech > getAttack())
			temp+=getAttack();
		else
			temp+=leech;
		
		setHealth(temp);
		
		checkSkill();
	}
}
