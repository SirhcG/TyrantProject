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
	public void ability(Player p, Player o) {
		setAttack(getAttack()+berserk);
		
	}
}
