import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am a judge of character.\n" + "Please, enter an integer:");

        int num = Integer.parseInt(sc.nextLine());

        char c = convertToCharacter(num);

        System.out.println(
                c != Character.MAX_VALUE ? "I judge " + num + " as \'" + c + "\'." : "I cannot judge " + num + ".");

    }

    // Palauttaa taulukosta numeroa vastaavan characterin.
    // Jos numero virheellinen palautta Characterin max valuen.
    public static char convertToCharacter(int num) {
        final char t[] = { '#', '@', '&', '$', '%', 'x', '*', 'o', '|', '!', ';', ':', '\'', ',', '.', ' ' };
        return num >= 0 && num <= 15 ? t[num] : Character.MAX_VALUE;
    }
}
