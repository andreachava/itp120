public class SodaSong {
    public static void main (String[] args) {
        int sodanum = 99;
        String word = "bottles";

        while (sodanum > 0) {

            if (sodanum == 1) {
                word = "bottle";
            }
            System.out.println(sodanum + " " + word + " of soda on the wall");
            System.out.println(sodanum + " " + word + " of soda");
            System.out.println("take one down, pass it around");
            System.out.println(sodanum + " " +  word + " of soda on the wall");
            sodanum = sodanum - 1;

            if (sodanum > 0) {
                System.out.println(sodanum + " " + word + " of soda on the wall");
            } else {
                System.out.println("No more bottles of soda on the wall");
            }
        }
    }
}
