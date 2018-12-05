

public class ElementSwapper {

    public static void main(String[] args) {
        System.out.println("Hello! I swap element values.\n" + "Please, enter array size:");
        int size = In.readInt();
        if (size > 0) {
            int[] t = new int[size];
            fillIntegerArray(t);
            printIntegerArray(t);
            System.out.println("Enter the first index value:");
            int first = In.readInt();
            System.out.println("Enter the second index value:");
            int second = In.readInt();
            boolean swap = swapElements(t, first, second);

            if (swap) {
                System.out.println("The element values were swapped.");
                printIntegerArray(t);
            } else {
                System.out.println("The element values were not swapped.");
                printIntegerArray(t);
            }
        } else {
            System.out.println("Error!");
        }

    }

    public static boolean swapElements(int[] t, int first, int second) {

        if ((t == null || t.length < 1)
                || ((first < 0 || first > t.length - 1) || (second < 0 || second > t.length - 1))) {
            return false;
        }

        int tmp = t[first];
        t[first] = t[second];
        t[second] = tmp;

        return true;

    }

    // Täyttää taulukon ja palauttaa totuusarvon operaation onnistumisesta ri
    // ppuen
    public static boolean fillIntegerArray(int[] t) {
        if (t == null || t.length < 1) {
            return false;
        }

        for (int i = 1; i <= t.length; i++) {
            System.out.println("Please, enter element value " + i + ":");

            t[i - 1] = In.readInt();
        }

        return true;
    }

    // Tulostaa taulukon
    public static void printIntegerArray(int[] t) {

        if (t != null) {
            System.out.print("{ ");

            for (int n : t) {
                System.out.print(n + " ");
            }

            System.out.println("}");

        }
    }
}
