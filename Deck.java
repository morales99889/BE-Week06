package week06DebugginAndUnitTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	Deck () { 
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
						   "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String value : values ) {
				Card card = new Card();
				String str = (value + " of " + suit);
				card.setName(str);
				card.setValue(count);
				
				this.cards.add(card);
				
				count++;
				
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw () {
		return cards.remove(0);
	}

}
