package mypackage;

import java.util.Scanner;

public class TemperatureConversion {
    Scanner scanner = new Scanner(System.in);
    double temp;
    double newTemp;
    String unit;

    public void tempConvert() {
        // Prompt user welcome message
        System.out.println("Temperature Conversion Program");

        // prompt user for choice of conversion (F -> C or C -> F)
       System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
       unit = scanner.next();

        // prompt user for temp
        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
        // close scanner
    }
}
