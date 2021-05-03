
public class Card {

	private int value;
	private String rank;
	private String suit;
	
	public Card(int value,String rank, String suit) {
		this.value = value;
		this.rank = rank;
		this.suit = suit;
}

	public String describe() {
		return rank+suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		
	}
}
/*Q1a:
 * i.	Fields
		1.	value (contains a value from 2-14 representing cards 2-Ace)
		2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	ii.	Methods
		1.	Getters and Setters
		2.	describe (prints out information about a card)
 */