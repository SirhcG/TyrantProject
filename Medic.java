package tyrantunlashed2;
/*
* this is a card
* this card has 0 attack and 5 health
*this card has 1 skills, leech(heal random card)
*/
public class Medic extends CardBase {
    
    private final String CardName;
    private CardSkill cs;
//to set the health and attack, furthermore, set the name of card
    public BarrageTank()
    {
        super(0,5);
        this.CardName = "Medic";
    }
// the first skill
//heal card
    public void skillOne(Player p, Player o)
    {
        this.cs = new Leech();
        cs.ability(p,o);
        cs.checkSkill();
    }
}