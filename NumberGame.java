import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int rounds = 0;
        String playAgain;

        do {
            rounds++;
            int number = rand.nextInt(100) + 1; // 1–100
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\nRound " + rounds);
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println(" Correct!");
                    score++;
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println(" Too high!");
                } else {
                    System.out.println(" Too low!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }
            

            if (!guessed) {
                System.out.println(" You lost! Number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n Game Over!");
        System.out.println("Total Rounds: " + rounds);
        System.out.println("Score: " + score);

        sc.close();
    }
}