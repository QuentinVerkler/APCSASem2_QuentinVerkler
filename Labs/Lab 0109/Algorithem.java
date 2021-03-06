import java.util.ArrayList;
/**
 * Write a description of class Algorithem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithem
{
    public static void main(){
        int[] nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 10);
        }
        
        ArrayList<Integer> sorted = mySort(nums);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        
        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + ", ");
        }
        System.out.println(); 
        
        //bubbleSort(nums);
        //selectionSort(nums);
        /*for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(); */
    }
    
    //fix this
    public static ArrayList<Integer> mySort(int[] nums){
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
                }
            }
            smallest++;
        }
        return sorted;
    }
    
    public static void bubbleSort(int[] nums){
        int end = nums.length - 1; 
        while(end > 1){
            for(int i = 0; i < end; i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            if(nums[end] > nums[end-1]){
                end -= 1;
            }
            if(nums[end] == nums[end-1]){
                end--;
            }
        }
    }
    
    public static void selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int place = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[place]){
                    place = j;
                }
            }
            int smallNum = nums[place];
            nums[place] = nums[i];
            nums[i] = smallNum;
        }
    }
}
