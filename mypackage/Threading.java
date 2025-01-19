package mypackage;

import java.util.Scanner;

public class Threading {
    public void startCountdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("You have 5 seconds to enter your name");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start(); 

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close(); 
    }
}
