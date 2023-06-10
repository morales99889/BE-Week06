package week06DebugginAndUnitTests;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;

	Player(String n){
		score = 0;
		name = n;
		
	}
	
	public int getScore() {
		return score;
		
	}
	
	public void describe() {
		System.out.println("Player: " + name);
	}
	
	public Card flip() {
		return hand.remove(0);
		
	}
	
	public void draw (Deck d) {
		hand.add(d.draw());
	}
	
	public void incrementScore() {
		score += 1;
	}
}
