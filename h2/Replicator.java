import java.util.Scanner;

public class Replicator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I replicate strings.\n" + "Please, enter a string:");
        String mj = sc.nextLine();
        System.out.println("Please, enter the number of replications:");
        int toistoja = Integer.parseInt(sc.nextLine());

        String uusi = replicate(mj, toistoja);
        System.out.println(!uusi.isEmpty() ? uusi : "Error!");

    }

    /*
     * Operaatio ottaa yhden merkkijonon ja yhden int muuttujan. Ohjelma tekee uuden
     * merkkijonon annetusta merkkijonosta for loopilla. Lopuksi ohjelma palautta
     * uuden merkkijonon joka on String -tyyppinen muuttujan.
     */
    public static String replicate(String mj, int toistoja) {
        String uusi = "";

        if (toistoja < 2) {
            return "";
        }

        for (int i = 0; i < toistoja; i++) {

            if (i + 1 == toistoja) {
                uusi += mj;
            } else {
                uusi += mj + ", ";
            }
        }

        return uusi;
    }
}
