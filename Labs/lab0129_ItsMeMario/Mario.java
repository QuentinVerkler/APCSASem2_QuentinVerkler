
/**
 * Write a description of class Mario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mario extends Character
{
    public Mario(int x, String phrase){
        super(x, phrase);
        
    }
    
    public void setSpeed(int x){
        super.setSpeed(x*2);
    }
}
