package ch15.simple.com;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> location;
    private int numOfHits = 0;
    public void setLocationCells(ArrayList<Integer> location) {
        this.location = location;
    }

    /*public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss";

        for (int i : location){
            if (guess == i){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == location.length){
            result = "kill";
        }

        return result;
    }*/

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss";

        int index = location.indexOf(guess);
        if (index >= 0){
            location.remove(index);
            if (location.isEmpty()) {
                result = "kill";
            }
            result = "hit";
        }
        return result;
    }
}
