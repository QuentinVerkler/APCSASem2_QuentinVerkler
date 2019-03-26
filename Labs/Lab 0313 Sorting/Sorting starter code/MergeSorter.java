
/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter extends Sorter
{
    public MergeSorter(){
        super();
    }
    
    public void sort(int[] a){
        mergeSort(a, a.length);
    }
    
    public void mergeSort(int[] nums, int n){
        if(n < 2) {return;}
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i = 0; i < mid; i++){
            l[i] = nums[i];
        }
        for(int i = mid; i < n; i++){
            r[i - mid] = nums[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        
        merge(nums, l, r, mid, n-mid);
    }
    
    public void merge(int[] a, int[] l, int r[], int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(lessEqual(l[i], r[j]))
                move(a, a[k++], l[i++]);
            else
                move(a, a[k++], r[j++]);
        }
        while (i < left){
            move(a, a[k++], l[i++]);
        }
        while (j < right){
            move(a, a[k++], r[j++]);
        }
    }
}
