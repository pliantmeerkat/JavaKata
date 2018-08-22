package lib.Klondike;

public class Card {

	public int cardNum;
	public char cardSuit;
	public char cardColor;
	public String cardName;
	
	public Card(int cardNum, char cardSuit) {
		this.cardNum = cardNum ;
		this.cardSuit = cardSuit;
		setCardColor();
	}
	
	private void setCardColor() {
		if(this.cardSuit == 'H' || this.cardSuit == 'D') {
			this.cardColor = 'R';
		}
		else {
			this.cardColor = 'B';
		}
	}
}
