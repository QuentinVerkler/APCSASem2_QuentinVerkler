
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSorter extends Sorter
{
    public SelectionSorter(){
        super();
    }
    
    public void sort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            int place = i;
            //second loop starts at one above i
            for(int j = i + 1; j < a.length; j++){
                //swapper
                if(less(a[place], a[j])){
                    place = j;
                }
            }
            swap(a, i, place);
            /*int smallNum = a[place];
            a[place] = a[i];
            a[i] = smallNum;*/
        }
    }
}
