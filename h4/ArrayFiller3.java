import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller3 {
    public static void main(String[] args) {
        System.out.println("Hello! I am an array filler.\n" + "Please, enter size:");

        int size = In.readInt();

        if (size >= 1) {

            char[] t = new char[size];

            boolean success = fillCharacterArray(t);
            printCharacterArray(t);

        } else {
            System.out.println("Error!");
        }

    }

    // Tulostaa taulukon
    public static void printCharacterArray(char[] t) {

        if (t != null) {
            System.out.print("{ ");

            for (char c : t) {
                System.out.print(c + " ");
            }

            System.out.println("}");

        }
    }

    //    Täyttää taulukon ja palauttaa totuusarvon operaation onnistumisesta riippuen
    public static boolean fillCharacterArray(char[] t) {
        if (t == null || t.length < 1) {
            return false;
        }


        for (int i = 1; i <= t.length; i++) {
            System.out.println("Please, enter value " + i + ":");

            t[i - 1] = In.readChar();
        }


        return true;
    }
}
