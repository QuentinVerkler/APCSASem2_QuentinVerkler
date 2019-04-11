
/**
 * Write a description of class ClimbInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    /***
     * Instance variables
     */
    private String peakName;
    private int climbTime;

    /**
     * Constructor for objects of class ClimbInfo
     */
    public ClimbInfo(String name, int time)
    {
        peakName = name;
        climbTime = time;
    }

    /**
     * Name getter
     *
     * @return    name of the moutain peak
     */
    public String getName(){
        return peakName;
    }
    
    /***
     * Time getter
     * 
     * @return     number of minutes taken to complete climb
     */
    public int getTime(){
        return climbTime;
    }
}
