public class Indenter {
    public static void main(String[] args) {

        int pituus = -1;
        try {
            pituus = Integer.parseInt(args[args.length - 1]);

        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
        }
        // Lisää ensimmäisen agrs parametrin verran välilyöntejä tulostukseen.
        if (pituus >= 0 && args.length >= 2) {

            for (int i = 0; i < args.length - 1; i++) {
                for (int j = 0; j < pituus; j++) {
                    System.out.print(" ");
                }
                System.out.println(args[i]);
            }
        } else {
            System.out.println("Error!");
        }

    }

}
