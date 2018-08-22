package lib.Klondike;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Card_test {

	Card card;
	
	@BeforeEach
	void initialize() {
		card = new Card(5, 'H');
	}
	
	@Test
	void cardNumTest() {
		assertEquals(5, card.cardNum);
	}
	
	@Test
	void cardSuitTest() {
		assertEquals('H', card.cardSuit);
	}
	
	@Test
	void cardColorTest() {
		assertEquals('R', card.cardColor);
	}
}
