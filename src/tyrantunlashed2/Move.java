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

}

    
    

