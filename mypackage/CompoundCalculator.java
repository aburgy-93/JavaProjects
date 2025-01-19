package mypackage;

import java.util.Scanner;

public class CompoundCalculator {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded ,timesCompounded * years);

        System.out.print("The amount after " + years + "is: $" + amount);

        scanner.close();
    }
}
