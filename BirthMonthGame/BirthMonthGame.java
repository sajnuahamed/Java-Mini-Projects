import java.util.Locale;
import java.util.Scanner;

/**
 * Prompts the user to enter their birth month and displays a humorous,
 * fictional personality description based on it.
 */
public class BirthMonthGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your birth month: ");
            String month = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (month) {
                case "JANUARY" ->
                    System.out.println("You are the exact type of person "
                            + "to aggressively argue with a GPS while confidently driving "
                            + "in the completely wrong direction.");

                case "FEBRUARY" ->
                    System.out.println("You will professionally overthink what to eat for dinner,"
                            + " only to end up eating cold cereal in bed at midnight.");
                case "MARCH" ->
                    System.out.println("People can usually find you trying to befriend "
                            + "a stray pigeon or squirrel on your lunch break.");
                case "APRIL" ->
                    System.out.println("You treat your daily caffeine intake like a highly classified scientific experiment"
                            + " that could go horribly wrong.");
                case "MAY" ->
                    System.out.println("You are 100% capable of explaining quantum physics to anyone, "
                            + "but only if it's 3:00 AM and you are sleep-deprived.");
                case "JUNE" ->
                    System.out.println("Your main hobby is buying plants, naming them, "
                            + "and then desperately keeping them alive with sheer willpower.");
                case "JULY" ->
                    System.out.println("You will walk into a room with a master plan to organize everything, "
                            + "get distracted by a shiny object, and completely forget why you are there.");
                case "AUGUST" ->
                    System.out.println("You strut through life like you are constantly walking a runaway, "
                            + "even when you are just taking out the trash.");
                case "SEPTEMBER" ->
                    System.out.println("You are secretly a medieval librarian trapped in a modern body, "
                            + "violently judging everyone’s grammar choices.");
                case "OCTOBER" ->
                    System.out.println("You are 40% spooky ghost, "
                            + "50% pumpkin spice, and 10% completely innocent chaos.");
                case "NOVEMBER" ->
                    System.out.println("You fiercely defend your right to take a three-hour nap "
                            + "in the middle of a perfectly productive day.");
                case "DECEMBER" ->
                    System.out.println("You will happily sing loudly at the top of your lungs while "
                            + "completely butchering the lyrics of any song.");
                default ->
                    System.out.println("I didn't realize " + month
                            + " was a month! I'll have to mark my calendar for the 32nd of " + month);
            }
        }
    }
}
