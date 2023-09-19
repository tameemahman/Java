
package question.pkg3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



  
   
       
       
public class FileIOExample {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Hello, world!\nThis is a Java File I/O example.\n");
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            System.out.println("Contents of " + inputFile + ":");
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}

        
        
    
    

