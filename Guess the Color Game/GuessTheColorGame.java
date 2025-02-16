
import java.util.Scanner;
import java.util.Random;
public class GuessTheColorGame {
    public static void main(String[] args) {
        String[] colors ={"red", "purple", "blue", "orange", "green", "yellow"};

        Random random = new Random();
        String chosenColor = colors[random.nextInt(colors.length)];

        Scanner scanner = new Scanner(System.in);
        String userGuess = "";

        final int MAX_ATTEMPTS = 5;
        System.out.println("Welcome to 'Guess the Color'!");
        System.out.println("I have picked a color from the following list:");
        System.out.println(String.join(", ", colors));
        System.out.println("Can you guess which one?");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts. Good Luck!");

        for (int attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextLine().toLowerCase();


            if (userGuess.equals(chosenColor)) {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempt(s). The color was " + chosenColor + "!");
                break;
            } else if (attempts < MAX_ATTEMPTS) {
                System.out.println("Wrong guess! Try Again");
            }
        }

        if (!userGuess.equals(chosenColor)) {
            System.out.println("Sorry, you've used all your attempts. The color was " + chosenColor + ".");
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}