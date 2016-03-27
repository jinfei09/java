package day7;

/**
 * Created by arika on 16/3/15.
 */
public class Player {
    static int playerCount = 0;
    private String name;
    public Player(String n){
        name = n;
        playerCount++;
    }
}
