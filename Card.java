
public class Card {

	private int value;
	private String name;

	//Getting and Settings
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//Describe method
	public void describe() {
		System.out.println( this.value + " of " + this.name);
	}
	
	//Constructor
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	
	
}
