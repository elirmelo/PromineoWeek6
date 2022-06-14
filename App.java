
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
	
		System.out.println(deck);
		
		deck.shuffle();
		
		for (int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", deck.draw());
			if ( i % 4 == 0) {
				System.out.println();
			}
		}

	}

}
