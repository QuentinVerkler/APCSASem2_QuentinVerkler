import java.util.ArrayList;
/**
 * Write a description of class QuestionFour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionFour
{
    //instance variables
    private ArrayList<String> words;
    
    /***
     * Constructors for QuestionFour
     */
    public QuestionFour(){
        words = new ArrayList<String>();
    }
    
    /***
     * Method sortStrings
     * 
     * @parameters: arraylist of strings that are all lowercase
     * @postconditions: sorts list of names into ascending order
     */
    public void sortStrings(ArrayList<String> names){
        for(int i = 1; i < names.size(); i++){
            for(int j = i; j > 0; j++){
                if(names.get(j).compareTo(names.get(j-1)) < 0){
                    String temp = names.get(j);
                    names.set(j, names.get(j-1));
                    names.set(j-1, temp);
                }
            }
        }
    }
    
    /***
     * Method shuffleStrings
     * 
     * @parameters: arraylist of strings that are all lowercase
     * @postcondition: list should be shuffled
     */
    public void shuffleStrings(ArrayList<String> names){
        for(int k = 51; k >= 0; k--){
            int r = (int)(Math.random() * k);
            String temp = words.get(k);
            words.set(k, words.get(r));
            words.set(r, temp);
          }
    }
    
    /***
     * Method insertString
     * 
     * @parametres: all strings are lowercase, takes a lowercase string
     * @postcondition: word is correctly put in the array list
     */
    public void insertString(String word){
        words.add(word);
        sortStrings(words);
        
    }
}
