package day5;

/**
 * Created by arika on 16/3/11.
 */
public class SimpleDotComGame {
    public static void main(String [] args){
        int numOfGuesses = 0;
        Gamehelper helper = new Gamehelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5);

        int [] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // end if
        } // end while
    } // end main
}
