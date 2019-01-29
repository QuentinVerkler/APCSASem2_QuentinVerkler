import java.util.ArrayList;
/**
 * Write a description of class MoreAlgorithems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoreAlgorithems
{
    //variables
    public static int compare = 0;
    public static int swap = 0;
    public static long time = 0;
    public static void main(){
        compare = 0;
        swap = 0;
        time = 0;
        int[] nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 10);
        }
        
        ArrayList<Integer> sorted = mySort(nums);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        
        /*
        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + ", ");
        }
        System.out.println(); */
        
        
        //bubbleSort(nums);
        //selectionSort(nums);
        //insertSort(nums);
        mergeSort(nums, nums.length-1);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        System.out.println("Compare: " + compare);
        System.out.println("Swap: " + swap);
        System.out.println("Time: " + time);
        
    }
    
    //fix this
    public static ArrayList<Integer> mySort(int[] nums){
        long tStart = System.nanoTime();
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        int smallest = 10000;
        //finding smallest number
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        //loop will stop when ArrayList is equal to nums
        while(sorted.size() < nums.length){
            //crawls through as smallest increase
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == smallest){
                    sorted.add(nums[i]);
                    swap++;
                }
                compare++;
            }
            smallest++;
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
        return sorted;
    }
    
    public static void bubbleSort(int[] nums){
        long tStart = System.nanoTime();
        int end = nums.length - 1; 
        //outside loop starts and end
        while(end > 1){
            //inside loop starts at beginning and ends at end
            for(int i = 0; i < end; i++){
                //actual swappers
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swap++;
                }
                compare++;
            }
            if(nums[end] > nums[end-1]){
                end -= 1;
            }
            if(nums[end] == nums[end-1]){
                end--;
            }
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
    
    public static void selectionSort(int[] nums){
        long tStart = System.nanoTime();
        //first loop starts at beginning
        for(int i = 0; i < nums.length - 1; i++){
            int place = i;
            //second loop starts at one above i
            for(int j = i + 1; j < nums.length; j++){
                //swapper
                if(nums[j] < nums[place]){
                    place = j;
                }
                compare++;
            }
            int smallNum = nums[place];
            nums[place] = nums[i];
            nums[i] = smallNum;
            swap++;
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
    
    public static void insertSort(int[] nums){
        long tStart = System.nanoTime();
        //starts at beginning
        for(int i = 1; i < nums.length; i++){
            //starts at i
            for(int j = i; j > 0; j--){
                //Swapping code
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap++;
                }
                compare++;
            }
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
    
    public static void mergeSort(int[] nums, int n){
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
    
    public static void merge(int[] a, int[] l, int r[], int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left){
            a[k++] = l[i++];
        }
        while (j < right){
            a[k++] = r[j++];
        }
    }
    
    
}
