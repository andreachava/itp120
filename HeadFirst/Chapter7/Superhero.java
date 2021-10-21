//inheritance test
class Superhero {
    String suit;
    String tights;
    String specialPower = "POW";
    void useSpecialPower() {
        System.out.println("I give you " + specialPower + "!");
    }
}


class main /* don't use this name for future ref (use TestDrive or smth) */ {
    public static void main(String [] args) {
        Superhero b = new Superhero();
        FriedEggMan a = new FriedEggMan();
        PantherMan c = new PantherMan();
        a.useSpecialPower();
        b.useSpecialPower();
        c.useSpecialPower();
    }
}
// :/ gonna have to come back to this later