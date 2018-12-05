import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am an array filler.\n" + "Please, enter size:");

        int size = Integer.parseInt(sc.nextLine());

        if (size >= 1) {

            char[] t = new char[size];
            for (int i = 1; i <= size; i++) {
                System.out.println("Please, enter value " + i + ":");
                char c = sc.nextLine().charAt(0);
                t[i - 1] = c;
            }

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
}
