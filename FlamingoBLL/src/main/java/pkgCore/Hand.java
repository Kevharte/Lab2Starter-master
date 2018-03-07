package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int x;
	private int y;
	private int z;
	
	public Hand(){}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			x=c.geteRank().getiRankNbr();
			if(c.geteRank().getiRankNbr()>10) {
				x=10;
			}
			if(c.geteRank().getiRankNbr() ==1 || c.geteRank().getiRankNbr()==14) {
				y=cards.indexOf(c);
				z=iScore[0];
			}
			if(y==cards.size()-1 && ((x += 11) <= 21)) {
				x=11;
			}else {
				x=1;
			}
			iScore[0] += x;
		}
		
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
