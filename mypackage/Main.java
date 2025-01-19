package mypackage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CompoundCalculator deposit = new CompoundCalculator();
        // deposit.calculate();

        // WeightConversion conversion = new WeightConversion();
        // conversion.convert(); 

        // TemperatureConversion temp = new TemperatureConversion();
        // temp.tempConvert();

        // Calculator calculator = new Calculator();
        // calculator.calculate();

        // GuessingGame game = new GuessingGame();
        // game.beginGame();

        // Banking bankAccount = new Banking();
        // bankAccount.beginBanking();

        // DiceRoll roll = new DiceRoll();
        // roll.startGame();

        // QuizGame quiz = new QuizGame();
        // quiz.beginQuiz();

        // RockPaperScissors game = new RockPaperScissors();
        // game.startGame();

        // Slots slotsGame = new Slots();
        // slotsGame.playGame();

        // WriteFile newFile = new WriteFile();
        // newFile.writeFile();

        // ReadFile readFile = new ReadFile();
        // readFile.read();

        // MusicPlayer player = new MusicPlayer();
        // player.playMusic();

        // HangmanGame newGame = new HangmanGame();
        // newGame.playGame();

        // Dates date = new Dates();
        // date.main();

        // Anonymous classes
        // Dog dog = new Dog();

        // // add custom behavior without having to create a new class.
        // // CANNOT BE REUSED
        // Dog dog2 = new Dog() {
        //     @Override 
        //     void speak() {
        //         System.out.println("Bark Bark");
        //     }
        // };

        // dog.speak();
        // dog2.speak();

        // Time time = new Time();
        // time.callTimer();

        // Countdown countdown = new Countdown();
        // countdown.startCountDown();

        // Hashmap map = new Hashmap();
        // map.createHashMap();

        // Threading newThread = new Threading();
        // newThread.startCountdown();

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread1 = new Thread(myRunnable);
        // Thread thread2 = new Thread(myRunnable);
        // thread1.start();
        // thread2.start();

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "files\\Acta Non Verba - Alex Hamlin.wav";

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();
        
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
                
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        
    }
}
