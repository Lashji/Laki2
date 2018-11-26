import java.util.ArrayList;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I count character occurrences between strings.\n" +
                "Enter the first string:");
        String eka = sc.nextLine();
        System.out.println("Enter the second string:");
        String toka = sc.nextLine();

        occurrences(eka, toka);


    }
//    tarkistaa esiintyvyydet
    private static void occurrences(String eka, String toka) {

        int count = 0;
        char[] sanat = new char[255];
        int sanatI = 0;

        for (int i = 0; i < eka.length(); i++) {
            for (int j = 0; j < toka.length(); j++) {
                if (eka.charAt(i) == toka.charAt(j)) {
                    if (!sisaltaaChar(eka.charAt(i), sanat)) {
                        sanat[sanatI] = eka.charAt(i);
                        count++;
                        sanatI++;
                    }
                }
            }

        }


        System.out.println("The number of occurrences is " + count + ".");

    }

    private static boolean sisaltaaChar(char c, char[] sanat) {
        for (int i = 0; i < sanat.length; i++) {
            if (sanat[i] == c) {
                return true;
            }

        }
        return false;
    }
}
