/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main() {
	/*	
	    String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
		
		
		d.shuffle();
		System.out.println("**** Shuffled Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
		

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		String[] ranks1 = {"jack", "queen", "king", "10", "9", "8", "7", "6",
		  "5", "4", "3", "2", "ace"};
		String[] suits1 = {"spade", "club", "diamond", "heart"};
		int[] pointValues1 = {11, 12, 13, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Deck d1 = new Deck(ranks1, suits1, pointValues1);
		
		System.out.println("**** !Test! Original Deck Methods ****");
		System.out.println("  toString:\n" + d1.toString());
		System.out.println("  isEmpty: " + d1.isEmpty());
		System.out.println("  size: " + d1.size());
		System.out.println();
		System.out.println();
		
		d1.shuffle();
		//testing if worked
		System.out.println("**** !Test! Shuffled Deck Methods ****");
		System.out.println("  toString:\n" + d1.toString());
		System.out.println("  isEmpty: " + d1.isEmpty());
		System.out.println("  size: " + d1.size());
		System.out.println();
		System.out.println();
	}
}
