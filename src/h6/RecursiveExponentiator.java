import java.util.Scanner;

public class RecursiveExponentiator {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! I am a recursive exponentiator.\n" +
                "Please, enter base:");
        int base = Integer.parseInt(SC.nextLine());
        System.out.println("Please, enter exponent:");
        int exponent = Integer.parseInt(SC.nextLine());
        double potenssi = 0;
        if (exponent == 0) {
            potenssi =1;
        } else {
            potenssi = exponentiate(base, exponent);

        }


        if (!Double.isNaN(potenssi)) {
            System.out.println(base + " ^ " + exponent + " = " + (int) potenssi + ".");
        } else {
            System.out.println("Error!");
        }


    }

    //    Laskee rekursiivisesti numeron potenssin.
    public static double exponentiate(int base, int exponent) {
        if (exponent < 0) {
            return Double.NaN;
        }

        if (exponent == 1) {
            return base;
        } else {
            return base * exponentiate(base, exponent - 1);
        }
    }

}
