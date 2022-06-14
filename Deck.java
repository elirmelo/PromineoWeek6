

import java.util.Random;

public class Deck 
{
	//Instatiate Card with cards
	private  Card[] cards = new Card[52];
	private static final Random rndNumbers = new Random();
	private int currentCard;
	
	//Constructor 
	public Deck() 
	{
		//define values to be used in the cards
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] name = {"Diamonds", "Spades", "Clubs", "Hearts" };
		
		currentCard = 0;
	
		//Populate deck of cards 
		for (int i=0; i < cards.length; i++) 
		{
			cards[i] = new Card(values[ i % 13 ], name[ i / 13]);
			cards[i].describe();
		}
		
	
	}
	

	//Shuffle method
	public void shuffle() 
	{
		currentCard = 0;
		for ( int i = 0; i < cards.length; i++ )
			{
				int second = rndNumbers.nextInt( 52 );
				Card temp = cards[ i ];
				cards[ i ] = cards[ second ];
				cards[ second ] = temp;
			}
	}
	
	//draw method
	public Card draw() 
	{
		if (currentCard < cards.length ) {
			return cards[ currentCard++ ];
		} else {
			return null;
		}
		
		
	}

}
