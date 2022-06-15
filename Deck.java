

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck 
{
	
	
	private int currentCard;
	static int counter = 51;
	private static final int NUMBER_OF_CARDS = 52;
	private static final Random randomNumbers = new Random();
	//Instantiate Card with cards
	public List<Card> cards = new ArrayList<Card>();
	
	
	
	//Constructor 
	public Deck() 
	{
		//define values to be used in the cards
		int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		String[] names = {"Diamonds", "Spades", "Clubs", "Hearts" };
		
		//Populate deck of cards 
		for (int i=0; i < 51; i++) 
		{
			cards.add(i, new Card( values[ i % 13 ], names[ i / 13 ] ));
		}
		/*for( int i=0; i < cards.size(); i++) {
			System.out.print(cards.get(i));
			if ( i % 4 == 0) {
				System.out.println();
			}
			if ( i % 12 == 0 ) {
				System.out.println();	
			}
		}*/

		
	}
	

	
	//shuffle method
	public void shuffle() 
	{
		Collections.shuffle(cards);
		
	}
	
	//draw method
	public Card draw() 
	{
		
		//int x = cards.size();
		cards.remove(cards.size()-1);
		//int y = cards.size();
		return cards.get(cards.size()-1);

	}
	
}
