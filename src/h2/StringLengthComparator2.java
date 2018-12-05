import java.util.Scanner;

public class StringLengthComparator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I compare the lengths of two strings.\n" + "Please, enter the first string:");
        String ekaS = sc.nextLine();
        System.out.println("Please, enter the second string:");
        String tokaS = sc.nextLine();
        int len = compareLengths(ekaS, tokaS);

        if (len == 0) {
            System.out.println("\"" + ekaS + "\" is as long as \"" + tokaS + "\".");
        } else if (len == -1) {
            System.out.println("\"" + ekaS + "\" is shorter than \"" + tokaS + "\".");
        } else {
            System.out.println("\"" + ekaS + "\" is longer than \"" + tokaS + "\".");

        }

    }

    // Vertaa merkkijonojen pituuksia ja palauttaa niiden perusteella int arvon
    public static int compareLengths(String ekaS, String tokaS) {

        if (ekaS.length() < tokaS.length()) {
            return -1;
        } else if (ekaS.length() > tokaS.length()) {
            return 1;
        }

        return 0;
    }
}