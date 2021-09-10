public class Who {
    private String myName;
    private int myAge = (int)(Math.random() * 10) + 10;
    private int ageGuessCount = 0;

    Who(String name) {
        myName = name;
    }
    public String sayHi() {
        return "My name is " + myName + " and I just want to say,\nthat the" + " thing I like most is to play, play, play!\n";
    }
    public String howOld(int guess) {
        this.ageGuessCount++;

        if (guess > myAge)
            return "I'm not that old.";
        if (guess < myAge)
            return "I'm older than that.";
        return "You guessed it!";
    }
    public int getGuessCount() {
        return this.ageGuessCount;
    }
    public String getMyName() {
        return this.myName;
    }
}