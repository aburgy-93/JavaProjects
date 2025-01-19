package mypackage;

import java.util.Scanner;

public class Banking {

    // Declare Variables
    Scanner scanner = new Scanner(System.in);
    

    public void beginBanking() {
        double balance = 0;
        boolean isRunning = true;
        int choice;

       while (isRunning) {
            displayMenu();

            // get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
       }

        System.out.println("Thank you! Have a nice day.");
        scanner.close();
    }

    // Display menu
    public void displayMenu() {
        System.out.println("*******************");
        System.out.println("Banking Program");
        System.out.println("*******************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*******************");
    }

    // showBalance()
    public void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    public double deposit() {
        double depositAmount;

        System.out.print("Enter an amount to deposit: ");
        depositAmount = scanner.nextDouble();

        if(depositAmount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            return depositAmount;
        }

    }

    // withdraw()
    public double withdraw(double balance) {
        double withdrawlAmount;

        System.out.print("Enter an amount to be withdrawn: ");
        withdrawlAmount = scanner.nextDouble();

        if(withdrawlAmount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else if (withdrawlAmount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else {
            return withdrawlAmount;
        }
    }
    // Exit
}
