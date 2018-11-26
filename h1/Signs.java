import java.util.Scanner;

public class Signs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! I compare signs.\n" + "Enter the first integer:");
        int firstInt = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second integer:");
        int secondInt = Integer.parseInt(sc.nextLine());

        compare(firstInt, secondInt);

    }

    // vertaa
    private static void compare(int firstInt, int secondInt) {

        if ((firstInt >= 0 && secondInt >= 0) || (firstInt < 0 && secondInt < 0)) {
            System.out.println("The signs are the same.");
        } else {
            System.out.println("The signs are different.");
        }

    }
}
