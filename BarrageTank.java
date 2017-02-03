package tyrantunlashed2;
/*
* this is a card
* this card has 3 attack and 5 health
*this card has 2 skills, strickboost and armorboost
*/
public class BarrageTank extends CardBase {
    
    private final String CardName;
    private CardSkill cs;
//to set the health and attack, furthermore, set the name of card
    public BarrageTank()
    {
        super(3,5);
        this.CardName = "Barrage Tank";
    }
// the first skill
//random strick a card
    public void skillOne(Player p, Player o)
    {
        this.cs = new StrickBoost();
        cs.ability(p,o);
        cs.checkSkill();
    }
// the second skill
//give extra armor
    public void skillTwo(Player p, Player o)
    {
        cs = new ArmorBoost();
        cs.ability(p,o);
        cs.checkSkill();
    }

}