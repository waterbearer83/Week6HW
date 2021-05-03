import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private int score = 0;
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	
	
	
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		Card top = hand.remove(hand.size()-1);
		return top;
	}
	
	public void incrementScore() {
		score += 1;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
	/*Q1c:
	 *i.	Fields
		1.	hand (List of Card)
		2.	score (set to 0 in the constructor)
		3.	name
	ii.	Methods
		1.	describe (prints out information about the player and calls 
			the describe method for each card in the Hand List)
		2.	flip (removes and returns the top card of the Hand)
		3.	draw (takes a Deck as an argument and calls the draw method on the deck, 
			adding the returned Card to the hand field)
		4.	incrementScore (adds 1 to the Player’s score field)
	 */