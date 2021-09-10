public class WhoDriver {
    public static void guessAge(Who sally) {
        String info;
        String message = "";
        CliReader reader = new CliReader();

        System.out.println("Time to guess " + sally.getMyName() + "'s age.");

        while (message != "You guessed it!") {
            info = reader.input("How old do you think I am?");
            message = sally.howOld(Integer.parseInt(info));
            System.out.println(message);
        }
        System.out.println("You took " + sally.getGuessCount() + " guesses.\n");
    }
    public static void main(String[] args) {
        Who thing1 = new Who("Thing 1");
        Who thing2 = new Who("Thing 2");

        System.out.println(thing1.sayHi());
        System.out.println(thing2.sayHi());

        guessAge(thing1);
        guessAge(thing2);
    }
}