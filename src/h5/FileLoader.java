import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileLoader {

    public static Scanner sc;


    public static void main(String[] args) throws Exception{
        sc = new Scanner(System.in);
        String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println(current);

        System.out.println("Hello! I load files.\n" +
                "Please, enter file name:");
        String s = sc.nextLine();
        sc.close();
        char[][] arr = loadToArray(s);


        print2DCharacterArray(arr);

    }


    public static char[][] loadToArray(String tiedostonimi) {
        File tiedosto = new File(tiedostonimi);
        int[] filesizes = countLines(tiedostonimi);
        try {
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
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            System.out.println("I could not count.");
            return null;
        } catch (Exception e) {
            System.out.println("I could not count.");
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
