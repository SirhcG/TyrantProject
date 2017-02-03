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
public abstract class Duel {

	private ArrayList<Player> players;
    
    public Duel(Player one, Player two){
    	
    	players = new ArrayList<>();
    	players.add(one);
    	players.add(two);
    }
    
   public void battle(int turnPlayer){
	   
	   //if its the players turn
		Player one = players.get(0);
		Player two = players.get(1);

		//if its the opponents turn
		if(turnPlayer == 2){
			one = players.get(1);
			two = players.get(0);
		}
	   
		for(int i=0; i<one.getField().size(); i++){
	    	   one.getCard(i).ability(one, two);
	    	   int dmg = one.getCard(i).getDamage();
	    	   int health = two.getCard(0).getHealth();
	    	   int val = health - dmg;
	    	   if(two.getField().size() > 0){
	    		   two.getCard(0).setHealth(val);	//death damage to the card
	    		   
	    		   if(two.getCard(0).getHealth() < 0){ // if the opposing card is dead
	    			   two.getField().remove(0);	//remove it
	    		   }
	    	   }
	    	   else{ //attack directly
	    		   two.setHealth(two.getHealth()-dmg);
	    	   }
	       }     
   }

}
