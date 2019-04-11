import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
    /***
     * instance variables
     */
    private List<ClimbInfo> climbList;

    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * Adds a new climb with name name and time time to the list of climbs
     *
     * @param  name in name of mountain
     * @return    the sum of x and y
     */
    public void addClimb(String peakName, int climbTime){
        climbList.add(new ClimbInfo(peakName, climbTime));
        for(int i = 1; i < climbList.size(); i++){
            for(int j = 1; j > 0; j--){
                String str1 = climbList.get(i).getName();
                String str2 = climbList.get(j).getName();
                /*if(str1.compareTo(str2) > 0){
                    String temp = str1;
                    str1 = str2;
                    str2 = temp;
                }
                */
                if(str1.equals(str2)){
                    int num1 = climbList.get(i).getTime();
                    int num2 = climbList.get(j).getTime();
                    if(num1 < num2){
                        int temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                }
            }
        }
    }
    
    /***
     * @return the number of distinct namesm in the list of clibms
     */
    public int distinctPeakNames(){
        if(climbList.size() == 0)
            return 0;
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        
        for(int k = 1; k < climbList.size(); k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if(!prevName.equals(currName)){
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
}
