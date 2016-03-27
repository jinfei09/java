package day7;

/**
 * Created by arika on 16/3/15.
 */
public class PlayerTestDrive {
    public static void main(String [] args){
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}
