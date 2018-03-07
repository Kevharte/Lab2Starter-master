package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		Deck test_a = new Deck();
		test_a.deck(1);
		Deck test_b = new Deck();
		test_b.deck(6);
		assertEquals(test_a.getSize(), 52);
		assertEquals(test_b.getSize(), 312);
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
	}

}
