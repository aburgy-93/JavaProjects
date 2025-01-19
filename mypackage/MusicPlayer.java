package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
    
    String filePath = "files\\Acta Non Verba - Alex Hamlin.wav";
    File file = new File(filePath);

    public void playMusic() {
        try( Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
           
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            

            String response = "";

           while(!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                   case "P" -> clip.start();
                   case "S" -> clip.stop();
                   case "R" -> clip.setMicrosecondPosition(0);
                   case "Q" -> clip.close();
                   default -> System.out.println("Invalid choice");
                }
           }
        } 
        catch (FileNotFoundException exception) {
            System.out.println("Could not locate file");
        }
        catch (LineUnavailableException exception) {
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException exception) {
            System.out.println("Audio file is not supported");
        }
        catch(IOException exception) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
