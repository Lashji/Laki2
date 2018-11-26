import java.util.Arrays;

public class CharacterFinder3 {
    public static void main(String[] args) {

        System.out.println("Hello! I try to find a character.\n" + "Please, enter array size:");
        int size = In.readInt();
        if (size == 0) {
            System.out.println("Error!");
        } else {

            char[] t = new char[size];
            for (int i = 1; i <= size; i++) {
                System.out.println("Please, enter element value " + i + ":");

                char tmpc = In.readChar();

                t[i - 1] = tmpc;

            }

            System.out.println("Please, enter a character:");
            char c = In.readChar();
            boolean loytyy = findCharacter(t, c);

            System.out.println("Character \'" + c + (loytyy ? "\' was found." : "\' was not found."));
        }

    }

    // Etsii character arvoa merkkijonosta ja palauttaa totuusarvon
    public static boolean findCharacter(char[] t, char c) {
        if (t != null) {
            Arrays.sort(t);
            int found = Arrays.binarySearch(t, c);
            if (found >= 0) {
                return true;
            }
        }
        return false;
    }
}