
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    // instance variables 
    Cell[][] grid;
    
    /***
     * Constructor
     */
    public GridTester(){
        grid = new Cell[100][100];
    }
    
    /***
     * Method loadOccupied
     * 
     * @precondition: nothing
     * @postcondition: all cells boolean property is 30% true
     */
    public void loadOccupied(){
        int id = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                boolean input;
                if((int)(Math.random()*9) >= 2)
                    input = false;
                else
                    input = true;
                Cell temp = new Cell(input, id);
                id++;
            }
        }
    }
}
