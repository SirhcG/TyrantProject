package tyrantunlashed2;

public class Weaken extends CardBase implements CardSkill{

	int weaken;
	
	public Weaken(int Attack, int Health, int _weaken){
        super(Attack, Health);
        this.weaken = _weaken;
    }
	
	@Override
	public void checkSkill() {
        System.out.println("Reduces Attack of a random enemy Assault card.\n");
    }
	
	@Override
	public void ability(Player p, Player o) {
		//CardBase[] oppField = o.getField();
		
	}
}
