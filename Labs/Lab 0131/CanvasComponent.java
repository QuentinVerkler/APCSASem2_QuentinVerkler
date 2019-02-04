import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;
    private int mouseFromX = 0;
    private int mouseFromY = 0;
    private boolean shapeSelected;
    //convas constructor
    CanvasComponent(int tempWidth, int tempHeight){
        setSize(tempWidth, tempHeight);
        width = tempWidth;
        height = tempHeight;
        x = tempWidth;
        y = tempHeight;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    
    //all methods
    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
    public void mouseClicked(MouseEvent e){
        
    }
    
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX == x && mouseFromY == y){
            shapeSelected = true;
        }
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    public void mouseEntered(MouseEvent e){
        
    }
    
    public void mouseExited(MouseEvent e){
        
    }
    
    public void mouseDragged(MouseEvent e){
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        x += mouseToX - mouseFromX;
        y += mouseToY - mouseFromY;
        repaint();
    }
    
    public void mouseMoved(MouseEvent e){
        
    }
}
