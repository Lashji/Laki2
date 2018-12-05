import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {
        System.out.println("Hello! I count lines.");
        if (args.length > 0) {
            String nimi = args[0];
            int lines = countLines(nimi);

            if (lines >= 0) {

                System.out.println("There are " + lines + " lines.");
            }


        } else {
            System.out.println("I could not count.");
        }
    }

    //    Operaatio lukee tiedoston jonka jälkeen laskee kuinka monta riviä siitä löytyy.
    //    Lopulta se palauttaa rivien määrän int -arvona.
    public static int countLines(String tiedostonimi) {
        int lines = 0;
        try {

            File tiedosto = new File(tiedostonimi);
            Scanner sc = new Scanner(tiedosto);

            while (sc.hasNextLine()) {
                lines++;
                sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("I could not count.");
            return -1;
        } catch (Exception e) {
            System.out.println("I could not count.");
            return -1;
        }
        return lines;
    }
}