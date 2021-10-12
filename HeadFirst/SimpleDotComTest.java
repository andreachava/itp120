class SimpleDotComTest {
    public static void main (String args[]) {
        SimpleDotCom test = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        test.setLocationCells(locations);
        String stringGuess = "2";
        test.checkYourself(stringGuess);
}
}