package mypackage;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public void startGame() {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random randomSelection = new Random();
        String userChoice;
        String computerChoice;
        String playAgain = "yes";
        String[] choices = {"Rock", "Paper", "Scissors"};

        do{
            // Get choice from the user
            System.out.print("Please enter your choice (Rock, Paper, Scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            if(!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {
                    System.out.println("Invalid choice.");
                    continue;
            }

            // get random choice from the computer
            computerChoice = choices[randomSelection.nextInt(3)].toLowerCase(); 
            System.out.println("Computer choose: " + computerChoice);
            // check win conditions
            if(userChoice.equals(computerChoice)) {
                System.out.println("Tie Game!");
            } else if (userChoice.equals("rock") && computerChoice.equals("Scissors")
                || userChoice.equals("paper") && computerChoice.equals("rock") 
                ||userChoice.equals("scissors") && computerChoice.equals("paper")) {
                    System.out.println("You Win!");
            } else {
                System.out.println("Computer Wins!");
            }
            // ask to play again

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while(playAgain.equals("yes"));

        // goodbye message

        scanner.close();
    }
}
