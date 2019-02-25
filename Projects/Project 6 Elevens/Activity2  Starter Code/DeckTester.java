/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main() {
        String[] ranks = {"King", "Queen", "Ten", "Three"};
        String[] suits = {"Diamonds", "Spades"};
        int[] values = {10, 4, 2, 5};
        Deck deck1 = new Deck(ranks, suits, values);
        System.out.println(deck1.toString());
        Card card = deck1.deal();
        System.out.println(card.toString());
        String[] ranks1 = {"King"};
        String[] suits1 = {"Diamonds"};
        int[] values1 = {10};
        Deck deck2 = new Deck(ranks1, suits1, values1);
        
    }
}
