package mypackage;

import java.util.Scanner;

public class WeightConversion {
    // Declare variables

    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    public void convert() { 
        // welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user input
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.print("Enter weight amount: ");
        weight = scanner.nextDouble();

        // option 1 convert lbs to kg
        if (choice == 1) {
            newWeight = weight / 2.205;
            System.out.printf("Entered: %.2f lbs\n", weight);
            System.out.printf("Converted: %.2f kgs", newWeight);
        // option 2 convert kgs to lbs
        } else if (choice == 2) {
            newWeight = weight * 2.205;
            System.out.printf("Entered: %.2f kgs\n", weight);
            System.out.printf("Converted: %.2f lbs", newWeight);
        // else print not a valid choice
        } else {
            System.out.println("You did not enter a valid option. Please try again.");
        }
        scanner.close();
    }
}
