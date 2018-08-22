package lib.Klondike;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Klondike_test {
	
	Klondike klondike;
	Random rand;
	ArrayList<Card> testDeck;
	
	@BeforeEach
	void initialize() {
		rand = new Random();
		klondike = new Klondike();
	}
	
	// instance variable tests

	@Test
	void gameRunningIsTrueOnInit() {
		assertFalse(klondike.gameOver);
	}
	
	void emptyFoundationPileOnStartup() {
		assertTrue(klondike.foundationPileList.isEmpty());
	}
	
	void stockCardListIsEmptyOnStartup() {
		assertTrue(klondike.stockCardList.isEmpty());
	}
	
	void acePileListIsEmpty() {
		assertTrue(klondike.acePileList.isEmpty());
	}
	
	// deck related tests
	
	@Test
	void hasACorrectDeckOnStartup(){
		assertEquals(klondike.deck.size(), 52);
		assertEquals(klondike.deck.get(0).cardNum, 1);
		assertEquals(klondike.deck.get(0).cardSuit, 'H');
		assertEquals(klondike.deck.get(51).cardNum, 13);
		assertEquals(klondike.deck.get(51).cardSuit, 'C');
	}
	
	@Test
	void canShuffleDeckProperly() {
		int[] cardOrderArray = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
		klondike.shuffleDeck();
		int[] shuffledDeckOrderArray = { klondike.deck.get(0).cardNum,
										 klondike.deck.get(1).cardNum,
										 klondike.deck.get(2).cardNum,
										 klondike.deck.get(3).cardNum,
										 klondike.deck.get(4).cardNum,
										 klondike.deck.get(5).cardNum,
										 klondike.deck.get(6).cardNum,
										 klondike.deck.get(7).cardNum,
										 klondike.deck.get(8).cardNum,
										 klondike.deck.get(9).cardNum,
									   };
		assertNotEquals(cardOrderArray, shuffledDeckOrderArray);
	}

	// game setup tests
	
	@Test
	void correctGameSetupTests() {
		
	}
}
