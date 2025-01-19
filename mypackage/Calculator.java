package mypackage;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double num1;
    double num2;
    double result;
    char operator; 
    boolean validOperator = true;
    
    public void calculate() {
        // Prompt user for first number
        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        // Prompt user for type of calculation
        System.out.print("What type of calculation are you performing? (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        //  Prompt user for second number
        System.out.print("Enter your second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    result =  num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> { 
                System.out.println("Invalid operation selected. Try again.");
                validOperator = false;
            }
        }

        if(validOperator) {
            System.out.println(result);
        }

        scanner.close();
    }
}
