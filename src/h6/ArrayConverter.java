import java.util.Scanner;

@SuppressWarnings("ALL")
public class ArrayConverter {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! I am an array converter.\n" +
                "Please, enter the number of rows:");
        int xlen = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter the number of columns:");
        int ylen = Integer.parseInt(sc.nextLine());

        char[][] charList = fill2DCharacterArray(xlen, ylen);
        if (charList == null) {
            System.out.println("Error!");
        }

        int[][] intArray = charactersToIntegers(charList);
        print2DIntegerArray(intArray, 2);

    }

    //    Muuttaa 2 ulotteisen char taulukon kaikki solut int arvoiksi
    public static int[][] charactersToIntegers(char[][] charList) {
        if (charList == null || charList.length < 1 || charList[0].length < 1) {
            return null;
        }
        int[][] tmp = new int[charList.length][charList[0].length];

        for (int i = 0; i < charList.length; i++) {
            for (int j = 0; j < charList[i].length; j++) {
                tmp[i][j] = convertToInteger(charList[i][j]);
            }
        }

        return tmp;
    }

//    muuttaa char muuttujan int arvoksi
    public static int convertToInteger(char c) {
        final char t[] = {'#', '@', '&', '$', '%', 'x', '*', 'o', '|', '!', ';', ':', '\'', ',', '.', ' '};

        for (int i = 0; i < t.length; i++) {
            if (c == t[i]) {
                return i;
            }
        }
        return 0;
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

    //    Tulostaa 2 ulotteisen taulukon
    public static void print2DIntegerArray(int[][] t, int n) {

        if (t != null && n >= 1) {

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    for (int k = 0; k < n - String.valueOf(t[i][j]).length(); k++) {
                        System.out.print(" ");
                    }
                    System.out.print(t[i][j] + (j + 1 < t[i].length ? " " : ""));
                }
                System.out.println("");
            }

        }
    }

}
