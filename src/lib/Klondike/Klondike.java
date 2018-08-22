/**
 * 
 */
package lib.Klondike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author jackbranch
 *
 */
public class Klondike {

	public ArrayList<Card> deck = new ArrayList<Card>();
	public ArrayList<Card> foundationPileList = new ArrayList<Card>();
	public ArrayList<Card> stockCardList = new ArrayList<Card>();
	public ArrayList<Card> acePileList = new ArrayList<Card>();
	public boolean gameOver;
	public int numMoves;
	
	public Klondike() {
		this.gameOver = false;
		this.numMoves = 0;
		makeDeck();
	}
	
	public void shuffleDeck() {
		Random rand = new Random();
		int index;
		// runs one time for each card, switches its position with a random card
		for(int i = 0; i < 52; i ++) {
			index = rand.nextInt(51);
			Collections.swap(this.deck, i, index);
		}
	}
	
	private void makeDeck() {
		// run four times, one for each suit.
		// within loop run 13 times adding cards to suit
		for(int i = 0; i < 4; i ++) {
			
			for(int j = 1; j < 14; j ++) {
				
				switch (i) {
				case 0:
					this.deck.add(new Card(j, 'H'));
					break;
				case 1:
					this.deck.add(new Card(j, 'D'));
					break;
					
				case 2:
					this.deck.add(new Card(j, 'S'));
					break;
					
				case 3:
					this.deck.add(new Card(j, 'C'));
					break;
				default:
					break;
				}
			}
		}
	}
	
}
