package tyrantunlashed2;
/*
* this is a card
* this card has 2 attack and 4 health
*this card has 1 skills, weaken(reduce the armor of target)
*/
public class Medic extends CardBase {
    
    private final String CardName;
    private CardSkill cs;
//to set the health and attack, furthermore, set the name of card
    public BarrageTank()
    {
        super(2,4);
        this.CardName = "Medic";
    }
// the first skill
//reduce the target's armor
    public void skillOne(Player p, Player o)
    {
        this.cs = new Weaken();
        cs.ability(p,o);
        cs.checkSkill();
    }
}