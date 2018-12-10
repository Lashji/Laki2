public class Array2DPrinter1 {
    public static void main(String[] args) {

        System.out.println(erotin());

        print2DCharacterArray(null);
        System.out.println(erotin());

        print2DCharacterArray(new char[][]{{'a'}});
        System.out.println(erotin());

        print2DCharacterArray(new char[][]{{'a', 'b', 'c'}});
        System.out.println(erotin());

        print2DCharacterArray(new char[][]{{'a'}, {'b'}, {'c'}});
        System.out.println(erotin());

        print2DCharacterArray(new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}});
        System.out.println(erotin());


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


    // palauttaa Stringin
    public static String erotin() {
        return "----------";
    }
}
