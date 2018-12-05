public class ShortestPart {
    public static void main(String[] args) {
        System.out.println("Hello! I find the length of the shortest substring.\n" +
                "Please, enter a string:");
        String s = In.readString();
        int n = measureShortestPart(s);
        System.out.println("The length is " + n + ".");
    }

    //    Etsii Stringistä lyhyimmän sanan ja palauttaa sen pituuden int arvona
    public static int measureShortestPart(String s) {
        String[] t = s.split(" ");
        int shortest = t[0].length();

        for (int i = 0; i < t.length; i++) {

            if (t[i].length() < shortest) {
                shortest = t[i].length();
            }

        }


        return shortest;
    }
}
