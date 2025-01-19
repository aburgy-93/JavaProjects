package mypackage;

import java.util.Scanner;

public class QuizGame {
    
    // Questions array[]
    String[] questions = {"What is the main function of a router?", 
                        "Which part of the computer is considered the brain?", 
                        "What year was Facebook Launched?", 
                        "Who is known as the father of computers?", 
                        "What was the first programming language?"};

    // Options array [][]
    String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords" }, 
                          {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"}, 
                          {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, 
                          {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                          {"1. COBAL", "2. C", "3. Fortran", "4. Assembly"}};
    // declare varaibles
    int[] answers = {3, 1, 2, 4, 3};
    int score = 0;
    int guess;
    Scanner scanner = new Scanner(System.in);

    public void beginQuiz() {
        // welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++ ) {
            System.out.println(questions[i]);
            
            for(String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("CORRECT!");
                score++;
            } else {
                System.out.println("WRONG!");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
  
}
