import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private String[] ranks = {"2 of ","3 of ","4 of ","5 of ","6 of ","7 of ","8 of ","9 of ","10 of ","Jack of ","Queen of ","King of ","Ace of "};
	private String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
	private int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private List<Card> cards = new ArrayList<Card>();
	public Deck() {
		
		for (int i = 0; i < ranks.length; i++) {
            for (String suit:suits) {
             cards.add(new Card(values[i], ranks[i], suit));
            }
	}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card takeTop = cards.remove(0);
		return takeTop;
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
/*Q1b:
 * i.	Fields
		1.	cards (List of Card)
	ii.	Methods
		1.	shuffle (randomizes the order of the cards)
		2.	draw (removes and returns the top card of the Cards field)
		3.	In the constructor, when a new Deck is instantiated, 
		the Cards field should be populated with the standard 52 cards.
 */