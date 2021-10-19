//ArrayList<String> locations = new ArrayList<String>();
import java.util.ArrayList;

class DotCom {
    private ArrayList<String> locationCells;
    private int numOfHits;

    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    String checkYourself (String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
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
}