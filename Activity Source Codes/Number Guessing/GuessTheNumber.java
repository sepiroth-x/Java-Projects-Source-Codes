 
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sepirothx
 * Description: For Students Learning Java
 * License: GNU Public License / Open-Source
 * Difficulty: Intemediate
 */

public class GuessTheNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100 (inclusive)
        Random random = new Random();
        int random_number = random.nextInt(100) + 1;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Play the game
        System.out.println("Welcome to the Guess the Number game!");
        guessTheNumber(random_number, scanner);

        // Close the scanner
        scanner.close();
    }

    // Function to play the game
    public static void guessTheNumber(int randomNumber, Scanner scanner) {
        while (true) {
            try {
                // Ask the user to guess the number
                System.out.print("Guess the number between 1 and 100: ");
                int userGuess = scanner.nextInt();

                // Compare the user's guess with the random number
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Try a higher number.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                    break; // Exit the loop when the correct guess is made
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
