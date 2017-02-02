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
    
	public enum StrategyType{
		SIMPLE, DEFENSIVE
	}
	//variable names should not be capitalized
    private int Health;
    private ArrayList<CardBase> Field;
    private ArrayList<CardBase> Hand;
    private int turnCounter = 0;
    private int CardsInField = 0;
    private int FieldPosition = 0;
    private int Check = 0;
    Strategy strategy;
    
    public Player(int Health , int cardAmount, StrategyType s){ //why do you need to pass in cardAmmount? is this just the maximum field and handsize? 
        this.Health = Health;
        Hand = new ArrayList<>();
        Field = new ArrayList<>();
        
        if(s == StrategyType.SIMPLE)
        	strategy = new SimpleStrategy(this);
        else if (s == StrategyType.DEFENSIVE)
        	strategy = new DefensiveStrategy(this);
        
    }
    
    public void setHealth(int Health){
        this.Health = Health;
    }
    
    public void setCards(ArrayList<CardBase> a){ //you can just 
        this.Hand = a;
    }
    
    public void setField(ArrayList<CardBase> b){
        this.Field = b;
    }
    
    
    public int getHealth(){
        return this.Health;
    }
    
    public int getTurn(){
        return this.turnCounter;
    }
    
    public void setTurn(){
        this.turnCounter++;
    }
    
    public void setCardInField(){
        this.CardsInField++;
    }
    
    public int getCardInField(){
        //return this.CardsInField;
    	return Field.size();
    }
    
    public void removeCard(){
       int temp = this.CardsInField--;
       if(temp < 0){
           this.CardsInField = 0;
       }
    }
    
    public void setCheck(){
        this.Check++;
    }
    public int Check(){
        return Check;
    }
    
    public void setPosition(){
        this.FieldPosition++;
    }
    
    public int getPosition(){
        return FieldPosition;
    }
    
    public void removePosition(){
        int temp = this.FieldPosition--;
        if(temp < 0){
            this.FieldPosition = 0;
        }
    }
    
    public void setCard(){
        
       CardBase temp = getHandCard(0); //why 0? What if i wanted to play the second card
       Field.set(FieldPosition, temp); //this can just be Field.add(temp); since add just adds it to the end of the array
       Hand.remove(0);
       Hand.trimToSize(); //this is unnecessary since remove(0) shifts all the remaining cards to the left
    }
    
   public CardBase getCard(int index){ //why not just run getField().get(index)
       return Field.get(index);
   }
   
   public CardBase getHandCard(int index){ //why not just run getHand.get(index)
       return Hand.get(index);
   }
   
  
   
   public void remove(int index){ //getField().remove(index) ?
       Field.remove(index);
   }
   
   public void removeHand(int index){ //getHand().remove(index)?
        Hand.remove(index);
        
   }
    
    public ArrayList<CardBase> getField(){
    	return Field;
    }
    
    public ArrayList<CardBase> getHand(){
        return Hand;
    }
    
    public void playCard(int i){
    	
    	CardBase c = Hand.get(i);
    	Field.add(c);
    	Hand.remove(i);
    }
    
    public void doMove(Move move){
    	playCard(move.handIndex);
    	turnCounter++;
    }
    
}
