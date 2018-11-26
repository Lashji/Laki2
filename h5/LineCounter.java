import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {
        String nimi = args[0];
        System.out.println("Hello, I count lines");
        System.out.println("There are " + countLines(nimi) + " lines.");
    }

    public static int countLines(String tiedosto) {
        int lines = 0;
        Scanner sc = new Scanner(tiedosto);

        while (sc.hasNextLine()) {
            lines++;
            sc.nextLine();
        }

        return lines;
    }
}