package week06DebugginAndUnitTests;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		System.out.println("Deck has been shuffled!");
		
		for (int i=0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} 
			else {
				player2.draw(deck);
			}
		}
		for (int i=0; i<26; i++) {
			Card cardOne = player1.flip();
			Card cardTwo = player2.flip();
			if (cardOne.getValue()>cardTwo.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins this round!");
			} else if (cardTwo.getValue()>cardOne.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins this round!");

			} else {
				System.out.println("This round ends in a draw");
			}
			
			
			int player1Score = player1.getScore();
			int player2Score = player1.getScore();
			System.out.println("Player 1 final score: " + player1Score);
			System.out.println("Player 2 final score: " + player2Score);
			
		}
	}


}
