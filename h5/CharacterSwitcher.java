import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class CharacterSwitcher {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! I am a character replacer.\n" +
                "Please, enter the number of rows:");
        int x = 0;
        int y = 0;

        try {
            x = Integer.parseInt(sc.nextLine());
            System.out.println("Please, enter the number of columns:");
            y = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
        }

        char[][] taulukko = fill2DCharacterArray(x, y);

        if (taulukko != null) {

            System.out.println("Please, enter the first character:");
            char char1 = ' ';
            char char2 = ' ';
            try {
                char1 = sc.nextLine().charAt(0);
                System.out.println("Please, enter the second character:");
                char2 = sc.nextLine().charAt(0);
            } catch (NumberFormatException e) {
            }

            boolean switched = switchCharacters(taulukko, char1, char2);

            if (switched) {
                print2DCharacterArray(taulukko);
            }
        } else {
            System.out.println("Error!");
        }
    }

    //    Vaihtaa taulukon parametrien mukaisen char arvot toisen char parametrin arvoksi
//    ja palauttaa totuusarvon jos operaatio onnistui.
    public static boolean switchCharacters(char[][] taulukko, char char1, char char2) {

        if (taulukko == null) {
            return false;
        }

        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                if (taulukko[i][j] == char1) {
                    taulukko[i][j] = char2;
                } else if (taulukko[i][j] == char2) {
                    taulukko[i][j] = char1;
                }
            }
        }

        return true;
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


    //    Tulostaa 2 ulotteisen taulukon
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
