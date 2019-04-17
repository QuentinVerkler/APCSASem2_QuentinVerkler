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
     * Getters
     */
    public boolean getOccupied(){
        return occupied;
    }
    
    public int getId(){
        return id;
    }
    
    /***
     * Method loadNeighbors
     * 
     * @parameters: nothing
     * @postcondition: neighbors will be loaded with the neighbors(north, east, south, west) that are empty
     * 
     */
    public void loadNeighbors(Cell[][] grid){
        int tempId = this.getId();
        if(tempId - 10 >= 0 && grid[(tempId/10) - 1][tempId%10].getOccupied())
            neighbors.add(grid[tempId/10][tempId%10]);
        if((tempId + 1)%10 != 0 && grid[tempId/10][tempId%10 + 1].getOccupied())
            neighbors.add(grid[tempId/10][tempId%10 + 1]);
        if(tempId + 10 < 100 && grid[(tempId/10) + 1][tempId%10].getOccupied())
            neighbors.add(grid[(tempId/10) + 1][tempId%10]);
        if((tempId - 1)%10 != 9 && grid[tempId/10][tempId%10 - 1].getOccupied())
            neighbors.add(grid[tempId/10][tempId%10 - 1]);
    }
}
