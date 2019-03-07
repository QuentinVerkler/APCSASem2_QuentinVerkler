import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
     public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
     }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        if(selectedCards.size() > 3)
            return false;
        if(selectedCards.size() < 3)
            return this.containsPairSum11(selectedCards);
        else
            return this.containsJQK(selectedCards);
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        List<Integer> cards = this.cardIndexes();
        /*
        //checking for elevens pair
        for(int i = 0; i < cards.size() - 1; i++){
            if(cards.get(i) + cards.get(i+1) == 11)
                return true;
        }
        if(cards.get(0) + cards.get(cards.size()-1) == 11)
            return true;
        
        //checking for J, Q, K combo  
        for(int i = 0; i < cards.size() - 2; i++){
            if(cards.get(i) + cards.get(i+1) + cards.get(i+2) == 0)
                return true;
        }
        */
        //checking for pair adding to elevens
        for(int i = 0; i < cards.size() - 1; i++){
            for(int j = i + 1; j < cards.size(); j++){
                if(cards.get(i) + cards.get(j) == 11)
                    return true;
            }
        }
        
        //checking for J, Q, K combo
        for(int i = 0; i < cards.size() - 2; i++){
            for(int j = i + 1; j < cards.size() - 1; j++){
                for(int x = j + 1; x < cards.size(); x++){
                    if(cards.get(i) + cards.get(j) + cards.get(x) == 0)
                        return true;
                }
            }
        }
        //checking if board is empty
        return !this.isEmpty();
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        if(selectedCards.size() == 2){
            Card card1 = this.cardAt(0);
            Card card2 = this.cardAt(1);
            return card1.pointValue() + card2.pointValue() == 11;
        }
        else
            return false;
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        if(selectedCards.size() == 3){
            Card card1 = this.cardAt(0);
            Card card2 = this.cardAt(1);
            Card card3 = this.cardAt(2);
            return card1.pointValue() + card2.pointValue() + card3.pointValue() == 0;
        }
        else
            return false;
    }
}
