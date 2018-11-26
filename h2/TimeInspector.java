import java.util.Scanner;

public class TimeInspector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I inspect a 24-hour time.\n" + "Please, enter hours:");
        int hours = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter minutes:");
        int minutes = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter seconds:");
        int seconds = Integer.parseInt(sc.nextLine());

        boolean result = inspectTime(hours, minutes, seconds);

        System.out.println("Time is " + (result ? "valid." : "invalid."));

    }

    // Tarkastaa ajan oikeellisuuden ja palauttaa boolean arvon
    public static boolean inspectTime(int hours, int minutes, int seconds) {

        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);

    }
}
