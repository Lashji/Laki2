import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialiser {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! I am an array initialiser.\n" +
                "Please, enter size:");

        int koko = Integer.parseInt(sc.nextLine());
        if (koko < 1){
            System.out.println("Error!");

        } else {
            System.out.println("Please, enter value:");
            int val = Integer.parseInt(sc.nextLine());

            int[] t = new int[koko];

//            Lisää luvut taulukon alkioon
            for (int i = 0; i < koko; i++) {
                t[i] = val;
            }

            System.out.print("{ ");
            for (int i = 0; i < t.length; i++) {
                System.out.print(t[i] + " ");
            }
            System.out.println("}");

        }


    }
}
