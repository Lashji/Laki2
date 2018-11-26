import java.util.Scanner;

public class StringLengthComparator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I compare the lengths of two strings.\n" + "Please, enter the first string:");
        String ekaS = sc.nextLine();
        System.out.println("Please, enter the second string:");
        String tokaS = sc.nextLine();
        compareStrings(ekaS, tokaS);

    }

    // vertaa stringeja
    private static void compareStrings(String ekaS, String tokaS) {

        if (ekaS.length() == tokaS.length()) {
            System.out.println("\"" + ekaS + "\" is as long as \"" + tokaS + "\".");
        } else if (ekaS.length() < tokaS.length()) {
            System.out.println("\"" + ekaS + "\" is shorter than \"" + tokaS + "\".");
        } else {
            System.out.println("\"" + ekaS + "\" is longer than \"" + tokaS + "\".");

        }

    }
}
