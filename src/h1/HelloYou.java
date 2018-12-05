import java.util.Scanner;

public class HelloYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I shall say hello to you.\n" + "Please, enter your name:");
        String nimi = sc.nextLine();
        tervehdi(nimi);

    }

    // Tämä on kommentti
    public static void tervehdi(String nimi) {
        System.out.println("Hello " + nimi + "!");
    }
}
