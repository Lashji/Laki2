import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class FrequencyCounter {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = 0;
        int cols = 0;

        System.out.println("Hello! I am a character counter.\n" +
                "Please, enter the number of rows:");

        try {
            rows = Integer.parseInt(sc.nextLine());
            System.out.println("Please, enter the number of columns:");
            cols = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }


        if (rows != 0 && cols != 0) {

            char[][] verrattava = fill2DCharacterArray(rows, cols);

            System.out.println("Please, enter characters to be counted:");
            String mj = sc.nextLine();

            int[] t = frequencyCounter(verrattava, mj.toCharArray());

            if (t.length > 0) {
                printIntArray(t);
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }

    }

    public static int[] frequencyCounter(char[][] verrattava, char[] taulukko) {

        if (verrattava != null && taulukko != null) {

            int[] t = new int[taulukko.length];

            for (int j = 0; j < taulukko.length; j++) {
                for (int i = 0; i < verrattava.length; i++) {

                    for (int k = 0; k < verrattava[i].length; k++) {

                        if (verrattava[i][k] == taulukko[j]) {
                            t[j]++;
                        }
                    }
                }
            }

            return t;
        }
        return new int[0];

    }

    //    Täyttää 2 -ulotteisen taulukon jonka jälkeen palauttaa sen
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

    // Tulostaa taulukon
    public static void printIntArray(int[] t) {

        if (t != null) {
            System.out.print("{ ");

            for (int c : t) {
                System.out.print(c + " ");
            }

            System.out.println("}");

        }
    }
}
