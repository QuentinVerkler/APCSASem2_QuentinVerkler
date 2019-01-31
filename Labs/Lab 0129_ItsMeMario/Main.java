
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
        Character mario = new Mario(100, "It's a me Mario");
        mario.setSpeed(100);
        System.out.println(mario.getCatchphrase());
        System.out.println(mario.getSpeed());
    }
}
