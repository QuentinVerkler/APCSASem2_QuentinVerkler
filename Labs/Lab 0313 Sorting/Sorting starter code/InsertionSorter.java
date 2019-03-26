
/**
 * Write a description of class InsertionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSorter extends Sorter
{
    public InsertionSorter(){
        super();
    }
    
    public void sort(int[] a){
        //starts at beginning
        for(int i = 1; i < a.length; i++){
            //starts at i
            for(int j = i; j > 0; j--){
                //Swapping code
                if(less(a[j-1], a[j])){
                    swap(a, j-1, j);
                }
            }
        }
    }
}
