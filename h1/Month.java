import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I verbalise your input.\n" + "Please, enter a number:");

        int kk = Integer.parseInt(sc.nextLine());
        tulostaKuukausi(kk);

    }

    // tulostaa kuukauden
    private static void tulostaKuukausi(int kk) {
        final String[] taulukko = { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        System.out.println("It is " + taulukko[kk - 1] + ".");

    }
}
