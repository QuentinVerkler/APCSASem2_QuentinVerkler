
/**
 * Write a description of class MySwingApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySwingApplication implements Runnable
{
    public static void run(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
        
    }
}
