
/**
 * Write a description of class BoardGames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoardGame implements Game
{
    //instance varialbes
    private String name;
    private int players;
    private int yearMade;
    
    /***
     * Constructor - assigns name, players, and year made
     */
    public BoardGame(String tempName, int tempPlayers, int made){
        name = tempName;
        players = tempPlayers;
        yearMade = made;
    }
    
    /***
     * Game methods
     */
    public boolean isFun(){
        return (players > 2);
    }
    
    public String name(){
        return name;
    }
    
    /***
     * BoardGame methods
     */
    
    public int yearMade(){
        return yearMade;
    }
}
