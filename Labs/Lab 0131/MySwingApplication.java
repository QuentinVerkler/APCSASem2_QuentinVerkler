import javax.swing.*;
/**
 * Write a description of class MySwingApplication here.
 *
 * @author (Quentin Verkler)
 * @version (a version number or a date)
 */
public class MySwingApplication implements Runnable
{
    private JFrame jFrame;
    private CanvasComponent canvasComponent;
    public void run(){
        jFrame = new JFrame("title");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasComponent = new CanvasComponent(40, 30);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        jFrame.addKeyListener(canvasComponent);
    }
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
    
}
