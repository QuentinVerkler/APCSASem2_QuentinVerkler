/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main() {
		Card card1 = new Card("King", "Heart", 11);
		Card card2 = new Card("King", "Heart", 11);
		Card card3 = new Card("Jack", "Spade", 11);
		//next two tests the match method
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		//tests toString method
		System.out.println(card1.toString());
	}
}
