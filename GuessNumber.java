import java.util.Scanner;

/**
 * The GuessNumber class is a simple game where the user tries to guess a secret number.
 * The class generates a random number between 0 and 99 and prompts the user to enter their guess.
 * It provides feedback to the user if their guess is too high or too low, and congratulates them when they guess the correct number.
 */
public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guess Number game!");
        System.out.println("Try to guess the secret number between 0 and 99.");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        scanner.close();
    }
}