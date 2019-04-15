import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Cell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cell
{
    // instance variables 
    boolean occupied;
    int id;
    List<Cell> neighbors = new ArrayList<Cell>();
    
    /***
     * Constructor
     */
    public Cell(boolean a, int b){
        occupied = a;
        id = b;
    }
    
    /***
     * Method loadNeighbors
     * 
     * @parameters: nothing
     * @postcondition: neighbors will be loaded with the neighbors(north, east, west, south) that are empty
     * 
     */
    public void loadNeighbors(){
        
    }
}
