//Q2:
public class App {

	public static void main(String[] args) {
		//Q3: Instantiate deck 
		Deck deck = new Deck();
		
		//Q3: Instantiate 2 players
		Player p1 = new Player("Corie");
		Player p2 = new Player("Jimie");
		
		//Q3: Call shuffle method on deck
		deck.shuffle();
		
		//Q4: Iterate thru deck and give player's their hands
		for(int i = 0; i < 26; i++) {
			p1.draw(deck);
			p2.draw(deck);
		}
		
		//Q5: Flip cards for each player until deck is depleted
		//Q5a: Compare the value of each card returned by the two player’s flip methods
		//	   Call the incrementScore method on the player whose card has the higher value
		for(int k = 0; k < 26; k++) {
			Card player1Card = p1.flip();
			Card player2Card = p2.flip();
			System.out.println(p1.getName()+ " has " +player1Card.describe());
			System.out.println(p2.getName()+ " has " +player2Card.describe());
		if(player1Card.getValue() == player2Card.getValue()) {
			System.out.println("WAR");
		}
		else if(player1Card.getValue() > player2Card.getValue()) {
			p1.incrementScore();
		}else if(player1Card.getValue() < player2Card.getValue()) {
			p2.incrementScore();
		}
	}
//		//Q6: Compare final score
//		//Q7: Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” 
//		//depending on which score is higher or if they are both the same.
		System.out.println(p1.getName() + " final score: "+p1.getScore());
		System.out.println(p2.getName() + " final score: "+p2.getScore());
		if(p1.getScore() == p2.getScore()) {
			System.out.println("Draw");
		}else if(p1.getScore() > p2.getScore()) {
			System.out.println("Player "+p1.getName()+" Wins");
		}	else if(p1.getScore() < p2.getScore()) {
				System.out.println("Player "+p2.getName()+" Wins");
	}
	}
}
