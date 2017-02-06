/*
 * Move class store the index of cards to be played onto the field. 
 */
package tyrantunlashed2;

import java.io.IOException;

/**
 *
 * @author planb
 */
public class Move{
    
	public int handIndex;

	
	public Move(int _handIndex){
		handIndex = _handIndex;
	}
	
	@Override
	public String toString(){
		return String.valueOf(handIndex);
	}

	public void go(Player p) {
		
		String name = p.getHand().get(handIndex).getName();
		p.playCard(handIndex);
		
		System.out.println(p.getName() + " PLAYED " + name + " ONTO THE FIELD\n");

		try {
			System.in.read();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		p.setTurn();
		
	}

}
