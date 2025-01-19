package mypackage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// FileWriter = good for small or medium-sized text files
// BufferedWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files (e.g., images, audio files)

public class WriteFile {


    public void writeFile() {
        String filePath = "output\\test.txt";
        String textContent = "I like pizza";
        
        try ( FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } 
        catch(FileNotFoundException exception) {
            System.out.println("Could not locate file location");
        }
        catch(IOException exception) {
            System.out.println("Could not write file");
        }
    }
}
