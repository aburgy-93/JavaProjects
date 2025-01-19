package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader + FileReader: best for reading text files line-by-line
// FileInputSTream: Best for binary files (e.g., images, audio files)
// RandomAccessFile: Best for read/write specific portions of a large file

public class ReadFile {
    String filePath = "output\\test.txt";

    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException exception) {
            System.out.println("Could not locate file");
        }
        catch (IOException exception) {
            System.out.println("Something went wrong");
        }
    }
}
