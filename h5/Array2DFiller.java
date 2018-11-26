import java.util.Scanner;

public class Array2DFiller {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        System.out.println("Hello! I am an array filler.\n" + "Please, enter the number of rows:");

        try {

            x = Integer.parseInt(sc.nextLine());
            System.out.println("Please, enter the number of columns:");
            y = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        char[][] taulukko = fill2DCharacterArray(x, y);

        print2DCharacterArray(taulukko);

    }

    // Täyttää 2 -ulotteisen taulukon jonka jälkeen palauttaa sen.
    public static char[][] fill2DCharacterArray(int x, int y) {

        if (x <= 0 || y <= 0) {
            return null;
        }
        char[][] taulukko = new char[x][y];
        String mj = "";
        int indeksi = 1;

        for (int i = 0; i < x; i++) {
            System.out.println("Please, enter row " + indeksi + ":");
            try {
                mj = sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            for (int j = 0; j < mj.length(); j++) {
                taulukko[i][j] = mj.charAt(j);
            }
            indeksi++;
        }

        return taulukko;
    }

    // Tulostaa 2 ulotteisen taulukon
    public static void print2DCharacterArray(char[][] t) {

        if (t != null) {

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j]);
                }
                System.out.println("");
            }

        } else {
            System.out.println("Error!");
        }
    }

}
