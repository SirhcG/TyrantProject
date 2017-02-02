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
public class Move {
    
	public int handIndex;
	
	public Move(int _handIndex){
		handIndex = _handIndex;
	}
	
	@Override
	public String toString(){
		return String.valueOf(handIndex);
	}
	/*
    private Player one;
   
    
    public Move(Player one){
        this.one = one;
       }
    
    
    public void playCard(){
               
            if(one.getCardInField()== 0){
               one.setCard();
               one.setCardInField();
               one.setTurn();
               one.setPosition();
               }
            else if(one.getCardInField() >= 1){
               one.setCard();
               one.setCardInField();
               one.setTurn();
               one.setPosition();
               }
           
            }
           */
}

    
    

