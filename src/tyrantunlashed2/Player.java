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
    private CardBase[] Field;
    private CardBase[] Hand;
    
    public Player(int Health , int cardAmount){
        this.Health = Health;
        CardBase[] Field = new CardBase[cardAmount];
    }
    
    public void setHealth(int Health){
        this.Health = Health;
    }
    
    public void setCards(CardBase[] z){
        this.Field = z;
    }
    
    public int getHealth(){
        return this.Health;
    }
    
    public int checkSize(){
        int temp = Field.length;
        return temp;
    }
    
}
