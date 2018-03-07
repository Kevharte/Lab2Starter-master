package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	//	TODO: Add a constructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	public void deck(int num_of_decks) {
		for(;num_of_decks > 0; num_of_decks--) {
			Card AoS = new Card(eRank.ACE, eSuit.SPADES);
			cards.add(AoS);
			Card AoH = new Card(eRank.ACE, eSuit.HEARTS);
			cards.add(AoH);
			Card AoD = new Card(eRank.ACE, eSuit.DIAMONDS);
			cards.add(AoD);
			Card AoC = new Card(eRank.ACE, eSuit.CLUBS);
			cards.add(AoC);
			
			Card KoS = new Card(eRank.KING, eSuit.SPADES);
			cards.add(KoS);
			Card KoH = new Card(eRank.KING, eSuit.HEARTS);
			cards.add(KoH);
			Card KoD = new Card(eRank.KING, eSuit.DIAMONDS);
			cards.add(KoD);
			Card KoC = new Card(eRank.KING, eSuit.CLUBS);
			cards.add(KoC);
			
			Card QoS = new Card(eRank.QUEEN, eSuit.SPADES);
			cards.add(QoS);
			Card QoH = new Card(eRank.QUEEN, eSuit.HEARTS);
			cards.add(QoH);
			Card QoD = new Card(eRank.QUEEN, eSuit.DIAMONDS);
			cards.add(QoD);
			Card QoC = new Card(eRank.QUEEN, eSuit.CLUBS);
			cards.add(QoC);
			
			Card JoS = new Card(eRank.JACK, eSuit.SPADES);
			cards.add(JoS);
			Card JoH = new Card(eRank.JACK, eSuit.HEARTS);
			cards.add(JoH);
			Card JoD = new Card(eRank.JACK, eSuit.DIAMONDS);
			cards.add(JoD);
			Card JoC = new Card(eRank.JACK, eSuit.CLUBS);
			cards.add(JoC);
			
			Card TenoS = new Card(eRank.TEN, eSuit.SPADES);
			cards.add(TenoS);
			Card TenoH = new Card(eRank.TEN, eSuit.HEARTS);
			cards.add(TenoH);
			Card TenoD = new Card(eRank.TEN, eSuit.DIAMONDS);
			cards.add(TenoD);
			Card TenoC = new Card(eRank.TEN, eSuit.CLUBS);
			cards.add(TenoC);
			
			Card NoS = new Card(eRank.NINE, eSuit.SPADES);
			cards.add(NoS);
			Card NoH = new Card(eRank.NINE, eSuit.HEARTS);
			cards.add(NoH);
			Card NoD = new Card(eRank.NINE, eSuit.DIAMONDS);
			cards.add(NoD);
			Card NoC = new Card(eRank.NINE, eSuit.CLUBS);
			cards.add(NoC);
			
			Card EoS = new Card(eRank.EIGHT, eSuit.SPADES);
			cards.add(EoS);
			Card EoH = new Card(eRank.EIGHT, eSuit.HEARTS);
			cards.add(EoH);
			Card EoD = new Card(eRank.EIGHT, eSuit.DIAMONDS);
			cards.add(EoD);
			Card EoC = new Card(eRank.EIGHT, eSuit.CLUBS);
			cards.add(EoC);
			
			Card SEoS = new Card(eRank.SEVEN, eSuit.SPADES);
			cards.add(SEoS);
			Card SEoH = new Card(eRank.SEVEN, eSuit.HEARTS);
			cards.add(SEoH);
			Card SEoD = new Card(eRank.SEVEN, eSuit.DIAMONDS);
			cards.add(SEoD);
			Card SEoC = new Card(eRank.SEVEN, eSuit.CLUBS);
			cards.add(SEoC);
			
			Card SIXoS = new Card(eRank.SIX, eSuit.SPADES);
			cards.add(SIXoS);
			Card SIXoH = new Card(eRank.SIX, eSuit.HEARTS);
			cards.add(SIXoH);
			Card SIXoD = new Card(eRank.SIX, eSuit.DIAMONDS);
			cards.add(SIXoD);
			Card SIXoC = new Card(eRank.SIX, eSuit.CLUBS);
			cards.add(SIXoC);
			
			Card FIVEoS = new Card(eRank.FIVE, eSuit.SPADES);
			cards.add(FIVEoS);
			Card FIVEoH = new Card(eRank.FIVE, eSuit.HEARTS);
			cards.add(FIVEoH);
			Card FIVEoD = new Card(eRank.FIVE, eSuit.DIAMONDS);
			cards.add(FIVEoD);
			Card FIVEoC = new Card(eRank.FIVE, eSuit.CLUBS);
			cards.add(FIVEoC);
			
			Card FOURoS = new Card(eRank.FOUR, eSuit.SPADES);
			cards.add(FOURoS);
			Card FOURoH = new Card(eRank.FOUR, eSuit.HEARTS);
			cards.add(FOURoH);
			Card FOURoD = new Card(eRank.FOUR, eSuit.DIAMONDS);
			cards.add(FOURoD);
			Card FOURoC = new Card(eRank.FOUR, eSuit.CLUBS);
			cards.add(FOURoC);
			
			Card THREEoS = new Card(eRank.THREE, eSuit.SPADES);
			cards.add(THREEoS);
			Card THREEoH = new Card(eRank.THREE, eSuit.HEARTS);
			cards.add(THREEoH);
			Card THREEoD = new Card(eRank.THREE, eSuit.DIAMONDS);
			cards.add(THREEoD);
			Card THREEoC = new Card(eRank.THREE, eSuit.CLUBS);
			cards.add(THREEoC);
			
			Card OoS = new Card(eRank.ONE, eSuit.SPADES);
			cards.add(OoS);
			Card OoH = new Card(eRank.ONE, eSuit.HEARTS);
			cards.add(OoH);
			Card OoD = new Card(eRank.ONE, eSuit.DIAMONDS);
			cards.add(OoD);
			Card OoC = new Card(eRank.ONE, eSuit.CLUBS);
			cards.add(OoC);
		}
		Collections.shuffle(cards);
	}
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller

	public Card draw() throws Exception {
		if(cards.size()==0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
	}

	public int getSize() {
		return cards.size();
	}
	}