import java.util.Scanner; 

class SimpleDotCom {
    int [] locationCells;
    int numOfHits;

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
    void setLocationCells(int[] cellLocations) {

    }
}

class SimpleDotComGame {
    public static void main(String [] args) {
        SimpleDotCom game = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        int numOfGuesses = 0;
        int randomNum = (int)(Math.random()*5);
        int [] locations = {randomNum, randomNum+1, randomNum+2};
        game.setLocationCells(locations);
        boolean isAlive = True;
        while (isAlive == True) {
            String guess = helper.getUserInput("Enter a number from 0 to 7: ");
            String result = game.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                
            }
        }
    }
}