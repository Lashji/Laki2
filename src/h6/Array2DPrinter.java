@SuppressWarnings("ALL")
public class Array2DPrinter {
    public static void main(String[] args) {

        System.out.println(erotin());

        print2DIntegerArray(null, 0);
        System.out.println(erotin());

        print2DIntegerArray(new int[][]{{1}}, 1);
        System.out.println(erotin());

        print2DIntegerArray(new int[][]{{1, 2, 3}}, 2);
        System.out.println(erotin());

        print2DIntegerArray(new int[][]{{1}, {22}, {333}}, 3);
        System.out.println(erotin());

        print2DIntegerArray(new int[][]{{15, 0, 7}, {4, 10, 13}}, 2);
        System.out.println(erotin());

        print2DIntegerArray(new int[][]{ { 123, 42 }, { 2023, 0 }, { 3, 1010 } }, 4);
        System.out.println(erotin());
    }

    //    Tulostaa 2 ulotteisen taulukon
    public static void print2DIntegerArray(int[][] t, int n) {

        if (t != null && n >= 1) {

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    for (int k = 0; k < n - String.valueOf(t[i][j]).length(); k++) {
                        System.out.print(" ");
                    }
                    System.out.print(t[i][j] + (j + 1< t[i].length ? " " : ""));
                }
                System.out.println("");
            }

        }
    }


    // palauttaa Stringin
    public static String erotin() {
        return "----------";
    }
}
