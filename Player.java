/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

/**
 *
 * @author planb
 */
public class Player {
    
    private int Health;
    private CardBase[] Cards;
    
    public Player(int Health , int cardAmount){
        this.Health = Health;
        CardBase[] Cards = new CardBase[cardAmount];
    }
    
    public void setHealth(int Health){
        this.Health = Health;
    }
    
    public void setCards(CardBase[] z){
        this.Cards = z;
    }
    
    public int getHealth(){
        return this.Health;
    }
    
    public int checkSize(){
        int temp = Cards.length;
        return temp;
    }
    
}
