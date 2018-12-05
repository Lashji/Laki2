import java.util.Scanner;

public class XNOR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am XNOR.\n" + "Please, enter the first truth value:");
        boolean firstV = sc.nextBoolean();
        System.out.println("Please, enter the second truth value:");
        boolean secondV = sc.nextBoolean();

        boolean result = computeXNOR(firstV, secondV);
        System.out.println("The result is " + result + ".");

    }

    // Palauttaa boolean arvon.
    public static boolean computeXNOR(boolean firstV, boolean secondV) {
        return (!firstV && !secondV) || (firstV && secondV);
    }
}
