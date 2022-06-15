import java.util.ArrayList;
import java.util.List;

public class Player
{
	//Fields
	public static int score;
	
	private String name;
	public List<Card> hand = new ArrayList<Card>();
	public 	Card crd = new Card();
	//public Deck deck = Deck();
	
	//Constructor
	public Player()
	{
			score = 0;
			Deck deck = new Deck();
			for (int i=0; i < 51; i++) {
				hand.add(i, deck.cards.get(i));
			}
			
	}
	
	
	//Describe method
	public void describe() 
	{
		Deck deck = new Deck();
	

		System.out.println("Player " + getName());
		hand.addAll(deck.cards);
		crd.describe();

	}
	
	//Getter and Setter
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	
	
	//Flip Method
	public Card flip() 
	{
		
		hand.remove(hand.size()-1);

		return hand.get(hand.size()-1);
	}
	
	//draw method
	public void draw(Deck deck) 
	{
		deck = new Deck();
		hand.add(deck.draw());
	}
	
	//increment score method
	public void incrementScore() {
		score++;
	}
	
}
