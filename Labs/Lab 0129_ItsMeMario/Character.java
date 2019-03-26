
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    private int speed = 0;
    private String catchphrase;
    public Character(int x, String y){
        speed = x;
        catchphrase = y;
    }
    
    public void setCatchphrase(String phrase){
        catchphrase = phrase;
    }
    
    public void setSpeed(int x){
        speed = x;
    }
    
    public String getCatchphrase(){
        return catchphrase;
    }
    
    public int getSpeed(){
        return speed;
    }
}
