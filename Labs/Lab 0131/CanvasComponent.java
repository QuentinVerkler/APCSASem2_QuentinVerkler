import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent 
        implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;
    private int mouseFromX = 0;
    private int mouseFromY = 0;
    private boolean shapeSelected;
    private int animationDeltaX = 1;
    private int animationDeltaY = 0;
    private int gutterX = 10;
    private int gutterY = 10;
    private Timer animationTimer;
    //convas constructor
    CanvasComponent(int tempWidth, int tempHeight){
        setSize(tempWidth, tempHeight);
        width = tempWidth;
        height = tempHeight;
        x = tempWidth;
        y = tempHeight;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }
    
    //all methods
    //paint methods
    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
    //mouse methods
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
        x = e.getX();
        y = e.getY();
        repaint();
    }
    
    public void mouseMoved(MouseEvent e){
        
    }
    
    //ActionListener (animation) method
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = this.getSize();
        if(x + width + gutterX > componentSizeDimension.getWidth()){
            animationDeltaX = 0;
            animationDeltaY = 1;
            x = (int)(componentSizeDimension.getWidth()) - width - gutterX - 1;
            y += animationDeltaY;
        }
        if(y + gutterY + height > componentSizeDimension.getHeight()){
            animationDeltaX = -1;
            animationDeltaY = 0;
            y = (int)(componentSizeDimension.getHeight()) - height - gutterY;
            x += animationDeltaX;
        }
        if(x < gutterX){
            animationDeltaX = 0;
            animationDeltaY = -1;
            x = gutterX;
            y += animationDeltaY;
        }
        if(y < gutterY){
            animationDeltaX = 1;
            animationDeltaY = 0;
            y = gutterY;
            x += animationDeltaX;
        }
        else{
            x += animationDeltaX;
            y += animationDeltaY;
        }
        repaint();
    }
    
    //KeyListener methods
    
}
