package com.tasks3.carddeck;

import java.util.*;

public class Deck {
	
	public Card[] deck = new Card[36];
	private int size = 0;
	
    public void shuffle() {
    	Random rng = new Random(System.currentTimeMillis());
    	
    	for (int i = 0; i < this.deck.length; i++)
    	{
    		int rRank = rng.nextInt(Rank.values.length);
    		int rSuit = rng.nextInt(Suit.values.length);
    		
    		this.deck[i] = new Card(Rank.values[rRank], Suit.values[rSuit]);
    		System.out.println(this.deck[i].getRank().getName() + " " + this.deck[i].getSuit().getName());
    	}
    	
    	this.size = 36;
    	
    	//Collections.shuffle(deck);
    }
    
    public void order() {
		for (int suit = 0, place = 0; suit < 4; suit++)
		{
			for (int rank = 0; rank < 9; rank++, place++)
			{
				this.deck[place] = new Card(Rank.values[rank], Suit.values[suit]);
				System.out.println(this.deck[place].getRank().getName() + " " + this.deck[place].getSuit().getName());
			}
		}
		this.size = 36;
    }
    
    public boolean hasNext() {
		return (this.size > 0);
    }
	
    public Card drawOne() {
    	if (size <= 0)
    	
    		return null;
    		
		Card rCard = this.deck[this.size - 1];
		this.deck[this.size - 1] = null;
		this.size--;
		return rCard;
    }
}