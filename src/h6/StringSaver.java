import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class StringSaver {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! I am an array saver.\n" +
                "Please, enter the number of rows:");
        int rows = Integer.parseInt(SC.nextLine());
        System.out.println("Please, enter the number of columns:");
        int cols = Integer.parseInt(SC.nextLine());

        char[][] charArray = fill2DCharacterArray(rows, cols);
        if (charArray == null) {
            System.out.println("Error!");
        } else {
            boolean save = saveStrings(charArray);
            System.out.println(save ? "Array saved." : "Array not saved");
        }

    }

    public static boolean saveStrings(char[][] charArray) {

        if (charArray == null) {
            return false;
        }

        try {
            File file = new File("lines.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos, true);

            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < charArray[i].length; j++) {

                    pw.print(charArray[i][j]);

                }
                pw.println();
            }
            pw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
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
                mj = SC.nextLine();
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
}
