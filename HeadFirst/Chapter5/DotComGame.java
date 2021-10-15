//ArrayList<int> locations = new ArrayList<int>();
import java.util.ArrayList;

class DotCom {
    int [] locationCells;
    int numOfHits = 0;
    
    private ArrayList<String> locationCells;

    String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells){
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}

class DotComGame {
    public static void main(String [] args) {
        DotCom game = new DotCom();
        GameHelper helper = new GameHelper();
        int numOfGuesses = 0;
        int randomNum = (int)(Math.random()*5);
        int [] locations = {randomNum, randomNum+1, randomNum+2};
        game.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Enter a number from 0 to 7: ");
            String result = game.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses +" guesses");
            }
        }
    }
}