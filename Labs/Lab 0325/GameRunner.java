import java.util.ArrayList;
/**
 * Write a description of class GameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameRunner
{
    public static void main(){
        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new VideoGame("Fallout 3", "Bethesda", 2005, false));
        games.add(new VideoGame("Doom", "ID software", 1991, false));
        games.add(new VideoGame("Halo 3", "Bungei", 2008, true));
        games.add(new BoardGame("Risk", 6, 1990));
        games.add(new BoardGame("Dixit", 6, 2010));
        games.add(new BoardGame("War On Terror", 6, 2007));
        
        for(int i = 1; i < games.size(); i++){
            for(int j = i; j > 0; j--){
                String name1 = games.get(j).name().toUpperCase();
                String name2 = games.get(j-1).name().toUpperCase();
                if(name1.compareTo(name2) < 0){
                    Game temp = games.get(j-1);
                    games.set(j-1, games.get(j));
                    games.set(j, temp);
                }
            }
        }
        
        for(int i = 0; i < games.size(); i++){
            System.out.println(games.get(i).name());
        }
    }
}
