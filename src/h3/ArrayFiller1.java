import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am an array filler.\n" + "Please, enter size:");

        int size = Integer.parseInt(sc.nextLine());

        if (size >= 1) {

            char[] t = new char[size];

            // Täyttää taulukon käyttäjän syöttämillä luvuilla
            for (int i = 1; i <= size; i++) {
                System.out.println("Please, enter value " + i + ":");
                char c = sc.nextLine().charAt(0);
                t[i - 1] = c;
            }

            System.out.print("{ ");
            for (int i = 0; i < t.length; i++) {
                System.out.print(t[i] + " ");
            }
            System.out.println("}");
        } else {
            System.out.println("Error!");
        }

    }
}
