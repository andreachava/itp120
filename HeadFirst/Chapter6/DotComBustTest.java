class DotComBustTest {
    void startPlaying() {
        while //dotcoms exist {
            String userInput = getUserInput("Enter a guess: ");
            checkUserGuess(userInput);
        }

    }

    void checkUserGuess(String userInput) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComSet : dotComsList) {
            if (checkYourself() == true) {
                result = "hit";
                break;
                if // third hit on dotcom {
                    // delete from array
                    result = "kill";
                    break;
                }
            }
            return result;
        }
    }
    public static void main(String [] args) {
        
    }
}