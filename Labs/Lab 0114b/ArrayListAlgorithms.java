import java.util.ArrayList;
/**
 * Write a description of class ArrayListAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListAlgorithms
{
    //public variables
    public static int compare = 0;
    public static int swap = 0;
    public static long time = 0;
    public static void main(){
        compare = 0;
        swap = 0;
        time = 0;
        ArrayList<Integer> random = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            random.add((int)(Math.random() * 10));
        }
        
        ArrayList<Integer> sorted = mySort(random);
        
        for(int i = 0; i < random.size(); i++){
            System.out.print(random.get(i) + ", ");
        }
        System.out.println();
        
        
        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + ", ");
        }
        System.out.println(); 
        
        
        //bubbleSort(random);
        //selectionSort(random);
        //insertSort(random);
        /*
        for(int i = 0; i < random.size(); i++){
            System.out.print(random.get(i) + ", ");
        }*/
        System.out.println();
        System.out.println("Compare: " + compare);
        System.out.println("Swap: " + swap);
        System.out.println("Time: " + time);
        
    }
    
    //fix this
    public static ArrayList<Integer> mySort(ArrayList<Integer> nums){
        long tStart = System.nanoTime();
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        int smallest = 10000;
        //finding smallest number
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < smallest){
                smallest = nums.get(i);
            }
        }
        //loop will stop when ArrayList is equal to nums
        while(sorted.size() < nums.size()){
            //crawls through as smallest increase
            for(int i = 0; i < nums.size(); i++){
                if(nums.get(i) == smallest){
                    sorted.add(nums.get(i));
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
    
    public static void bubbleSort(ArrayList<Integer> nums){
        long tStart = System.nanoTime();
        int end = nums.size() - 1; 
        //outside loop starts and end
        while(end > 1){
            //inside loop starts at beginning and ends at end
            for(int i = 0; i < end; i++){
                //actual swappers
                if(nums.get(i) > nums.get(i+1)){
                    int temp = nums.get(i);
                    nums.set(i, nums.get(i+1));
                    nums.set(i+1, temp);
                    swap++;
                }
                compare++;
            }
            if(nums.get(end) > nums.get(end-1)){
                end -= 1;
            }
            if(nums.get(end) == nums.get(end-1)){
                end--;
            }
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
    
    public static void selectionSort(ArrayList<Integer> nums){
        long tStart = System.nanoTime();
        //first loop starts at beginning
        for(int i = 0; i < nums.size() - 1; i++){
            int place = i;
            //second loop starts at one above i
            for(int j = i + 1; j < nums.size(); j++){
                //swapper
                if(nums.get(j) < nums.get(place)){
                    place = j;
                }
                compare++;
            }
            int smallNum = nums.get(place);
            nums.set(place, nums.get(i));
            nums.set(i, smallNum);
            swap++;
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
    
    public static void insertSort(ArrayList<Integer> nums){
        long tStart = System.nanoTime();
        //starts at beginning
        for(int i = 1; i < nums.size(); i++){
            //starts at i
            for(int j = i; j > 0; j--){
                //Swapping code
                if(nums.get(j) < nums.get(j-1)){
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j-1));
                    nums.set(j-1, temp);
                    swap++;
                }
                compare++;
            }
        }
        long tEnd = System.nanoTime();
        time = tEnd - tStart;
    }
}
