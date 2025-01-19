package mypackage;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);
    
    public void beginGame() {
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n ", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++; 

            if(guess < randomNumber) {
                System.out.println("Guess is too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Guess is too High! Try again.");
            } else {
                System.out.println("CORRECT!");
                System.out.println("Your guess: " + guess);
                System.out.println("Random number: " + randomNumber);
                System.out.println("Number of guesses: " + attempts);
            }
        } while (guess != randomNumber);
        scanner.close();
    }
}
