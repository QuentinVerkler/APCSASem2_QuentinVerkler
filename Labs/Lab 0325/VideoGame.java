
/**
 * Write a description of class VideoGames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VideoGame implements Game
{
    //instance variables
    private String name;
    private int yearMade;
    private boolean multiplayer;
    private String publisher;
    
    /***
     * Constructor - assigns name, publisher, when it was made, and whether or not it is multiplayer
     */
    public VideoGame(String tempName, String tempPublisher, int tempMade, boolean mult){
        name = tempName;
        yearMade = yearMade;
        multiplayer = mult;
        publisher = tempPublisher;
    }
    
    /***
     * Game methods
     */
    public boolean isFun(){
        return multiplayer;
    }
    
    public String name(){
        return name + ", " + publisher;
    }
    
    /***
     * VideoGame methods
     */
    public int yearMade(){
        return yearMade;
    }
}
