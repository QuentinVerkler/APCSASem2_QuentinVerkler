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
    private int motionSpeed = 1;
    private boolean outsideSelected;
    //convas constructor
    CanvasComponent(int tempWidth, int tempHeight){
        //creating the shapte
        setSize(tempWidth, tempHeight);
        width = tempWidth;
        height = tempHeight;
        x = tempWidth;
        y = tempHeight;
        //the mouse objects added
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }
    
    //all methods
    //paint methods
    public void paintComponent(Graphics g){
        //paints the componenet
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
    //mouse methods
    public void mouseClicked(MouseEvent e){
        
    }
    
    public void mousePressed(MouseEvent e){
        //sees if the mouse presses on the shape
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        //if x and y coordinants equal those of the shape, it is grabbed
        if(mouseFromX == x && mouseFromY == y){
            shapeSelected = true;
        }
        else
            outsideSelected = true;
    }
    
    public void mouseReleased(MouseEvent e){
        outsideSelected = false;
    }
    
    public void mouseEntered(MouseEvent e){
        
    }
    
    public void mouseExited(MouseEvent e){
        
    }
    
    public void mouseDragged(MouseEvent e){
        //points where the mouse is
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        //sets the rectangle to the mouse
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
        //if the mouse is clicked, get 'em!
        if(outsideSelected == true){
            //animationDeltaX = (int)(Math.sqrt(Math.pow(mouseFromX + componentSizeDimension.getWidth(), 2)));
            //animationDeltaY = (int)(Math.sqrt(Math.pow(mouseFromY + componentSizeDimension.getHeight(), 2)));
            animationDeltaX = (mouseFromX - (x + width/2))/10;
            animationDeltaY = (mouseFromY - (y + height/2))/10;
            x+= animationDeltaX * motionSpeed;
            y+= animationDeltaY * motionSpeed;
            
        }
        
        //if it hits the right side, go down
        if(x + width + gutterX > componentSizeDimension.getWidth()){
            animationDeltaX = 0;
            animationDeltaY = 1;
            x = (int)(componentSizeDimension.getWidth()) - width - gutterX - 1;
            y += animationDeltaY * motionSpeed;
        }
        //if it hits the bottom, go right
        if(y + gutterY + height > componentSizeDimension.getHeight()){
            animationDeltaX = -1;
            animationDeltaY = 0;
            y = (int)(componentSizeDimension.getHeight()) - height - gutterY;
            x += animationDeltaX * motionSpeed;
        }
        //if it hits the left side, go up
        if(x < gutterX){
            animationDeltaX = 0;
            animationDeltaY = -1;
            x = gutterX;
            y += animationDeltaY * motionSpeed;
        }
        //if it hits the top, go right
        if(y < gutterY){
            animationDeltaX = 1;
            animationDeltaY = 0;
            y = gutterY;
            x += animationDeltaX * motionSpeed;
        }
        
        //otherwise, keep on going in set direction
        else{
            x += animationDeltaX * motionSpeed;
            y += animationDeltaY * motionSpeed;
        }
        repaint();
    }
    
    //KeyListener methods
    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
        //if key pressed is '+', go faster. if it's '-', go slower
        if(keyChar == '+')
            motionSpeed += 1;
        else if (keyChar == '-' && motionSpeed > 0)
            motionSpeed -= 1;
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e){
        
    }
}
