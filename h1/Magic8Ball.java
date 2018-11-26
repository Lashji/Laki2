import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! I am a Magic 8 Ball.\n" + "Ask me:");
        sc.nextLine();
        tulosta();
    }

    public static void tulosta() {
        System.out.println(arvoVastaus());

    }

    // kommentti
    public static String arvoVastaus() {

        final String[] vastaukset = { "It is certain.", "As I see it, yes.", "Reply hazy try again.",
                "Don't count on it.", "It is decidedly so.", "Most likely.", "Ask again later.", "My reply is no.",
                "Without a doubt.", "Outlook good.", "Better not tell you now.", "My sources say no.",
                "Yes definitely.", "Yes.", "Cannot predict now.", "Outlook not so good.", "You may rely on it.",
                "Signs point to yes.", "Concentrate and ask again.", "Very doubtful." };

        return vastaukset[(int) (Math.random() * vastaukset.length) + 1];
    }

}
