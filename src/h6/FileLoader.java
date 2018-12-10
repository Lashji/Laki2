import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileLoader {

    public static Scanner sc;


    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        System.out.println("Hello! I load files.\n" +
                "Please, enter file name:");
        String s = sc.nextLine();
        sc.close();
        char[][] arr = loadToArray(s);

        if (arr != null) {

            print2DCharacterArray(arr);

        } else {
            System.out.println("I could not load.");
        }
    }

    //    Lataa tekstitiedoston 2 -ulotteiseen taulukkoon ja palauttaa sen
    public static char[][] loadToArray(String tiedostonimi) {


        try {
            File tiedosto = new File(tiedostonimi);
            int[] filesizes = countLines(tiedostonimi);

            if (filesizes != null) {

                sc = new Scanner(tiedosto);
                char[][] t = new char[filesizes[0]][filesizes[1]];

                int i = 0;

                while (sc.hasNextLine()) {
                    String tmps = sc.nextLine();
                    for (int j = 0; j < filesizes[1]; j++) {

                        t[i][j] = tmps.charAt(j);

                    }
                    i++;
                }
                sc.close();
                return t;
            }
            return null;
        } catch (FileNotFoundException e) {
//            System.out.println("I could not load.");
        } catch (Exception e) {
//            System.out.println("I could not load.");
        }


        return null;


    }

    //    Operaatio lukee tiedoston jonka jälkeen laskee kuinka monta riviä siitä löytyy.
    //    Lopulta se palauttaa rivien määrän int -arvona.
    public static int[] countLines(String tiedostonimi) {
        int[] lines = new int[2];
        try {

            File tiedosto = new File(tiedostonimi);
            sc = new Scanner(tiedosto);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                lines[1] = s.length();
                lines[0]++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
//            System.out.println("I could not load.");
            return null;
        } catch (Exception e) {
//            System.out.println("I could not load.");
            return null;
        }
        return lines;
    }

    //    Tulostaa 2 ulotteisen taulukon
    public static void print2DCharacterArray(char[][] t) {

        if (t != null) {

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j]);
                }
                System.out.println("");
            }

        }
    }
}
