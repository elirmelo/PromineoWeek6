
public class App {

	public static void main(String[] args) 
	{
		Deck deck = new Deck();
		int win = 0;

		
		//Instantiate 2 player
		Player p1 = new Player();
		Player p2 = new Player();
		
		//Call shuffle method on deck
		
		deck.shuffle();
		
		for(int i=0; i < 52; i++) 
		{
			p1.draw(deck);
			p2.draw(deck);
			System.out.println();
		}
		
		for(int j=0; j<26; j++) 
		{
			if ( p1.flip().getValue() > p2.flip().getValue() ) 
			{
				p1.incrementScore();
				System.out.println("Player 1 hand");
				System.out.println();
			}else if ( p2.flip().getValue() > p1.flip().getValue() ) 
			{
				p2.incrementScore();
				System.out.println("Player 2 hand");
				System.out.println();
			}
		}
			
		
		if ( p1.score > p2.score) 
		{
			win=1;
		} else if (p2.score > p1.score) 
		{
			win=2;
		}
	
		System.out.println("Pleayer 1 score: " + p1.score);
		System.out.println("Pleayer 2 score: " + p2.score);
		System.out.println();
		if (win == 1) 
		{
			System.out.println("Player 1 wins!!");
		}else if( win == 2) 
		{
			System.out.println("Player 2 wins!!");
		}

	}

}
