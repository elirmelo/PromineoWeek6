
public class Player {

	Deck hand = new Deck();
	private String name;
	public double score; 
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	//gettings and settings
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//describe method from Player
	public void describe () 
	{
		System.out.println("Plyer " + name);
		hand.draw();
		
	}
	
	//Flip method
	public Card flip () {
		return hand.draw();
	}
	
	//draw method
	public Card draw() {
		return hand.draw();
		
	}
	
	public void incrementScore() {
		score++;
	}
	
	//Constructor player
	Player () {
		
		score = 0.0;
	}
}
