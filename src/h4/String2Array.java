@SuppressWarnings("Duplicates")
public class String2Array {

    public static void main(String[] args) {

        System.out.println("Hello! I convert a string to an array.\n" + "Please, enter the string:");
        String s = In.readString();
        char[] t = convertToArray(s);
        printCharacterArray(t);
    }

    public static char[] convertToArray(String s) {
        char[] t = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            t[i] = s.charAt(i);
        }

        return t;
    }

    // Tulostaa taulukon
    public static void printCharacterArray(char[] t) {

        if (t != null) {
            System.out.print("{ ");

            for (char c : t) {
                System.out.print(c + " ");
            }

            System.out.println("}");

        }
    }
}
