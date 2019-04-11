
/**
 * Write a description of class ClimbRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbRunner
{
    public static void main(){
        ClimbingClub club = new ClimbingClub();
        club.addClimb("Bob", 234);
        club.addClimb("Sven", 243);
        club.addClimb("Bob", 309);
        System.out.println(club.distinctPeakNames());
        System.out.println(club.string());
    }
}
