package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public void main() {
        
        int input;

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            System.out.println(input);

        } catch (InputMismatchException exception) {
            System.out.println("Please enter a number.");
        }
        catch (Exception exception) {
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("This always executes!");
        }
    }
}
