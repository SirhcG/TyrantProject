/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

import java.util.ArrayList;

/**
 *
 * @author planb
 */
public class Player {
    
    private int Health;
    private ArrayList<CardBase> Field;
    private ArrayList<CardBase> Hand;
    
    public Player(int Health , int cardAmount){
        this.Health = Health;
        CardBase[] Field = new CardBase[cardAmount];
    }
    
    public void setHealth(int Health){
        this.Health = Health;
    }
    
    public void setCards(ArrayList<CardBase> z){
        this.Field = z;
    }
    
    public int getHealth(){
        return this.Health;
    }
    
    public ArrayList<CardBase> getField(){
    	return Field;
    }
    
    
}
