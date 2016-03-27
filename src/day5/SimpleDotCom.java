package day5;

/**
 * Created by arika on 16/3/11.
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public int[] getLocationCells() {
        return locationCells;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "miss";
//        int numOfHits = 0;
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } //end if
        } // end for

        if(numOfHits == locationCells.length){
            result = "kill";
        } //end if
        System.out.println(result);
        return result;
    }
}
