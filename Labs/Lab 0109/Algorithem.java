import java.util.ArrayList;
/**
 * Write a description of class Algorithem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithem
{
    public ArrayList<Integer> sortSmallToLarge(int[] nums){
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        sorted.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < sorted.size(); j++){
                if(nums[i] < sorted.get(j)){
                    sorted.add(0, nums[i]);
                    j = sorted.size();
                }
                if(nums[i] > sorted.get(j)){
                    sorted.add(nums[i]);
                    j = sorted.size();
                }
            }
        }
        return sorted;
    }
}
