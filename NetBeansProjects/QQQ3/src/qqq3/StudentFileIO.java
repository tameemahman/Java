
package qqq3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




   
    
       
        

public class StudentFileIO {

    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "student_output.txt";

        // Writing student data to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String[] studentNames = {"Alice", "Bob", "Charlie"};
            int[] studentAges = {20, 21, 19};

            for (int i = 0; i < studentNames.length; i++) {
                writer.write(studentNames[i] + "," + studentAges[i] + "\n");
            }

            System.out.println("Student data written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Reading student data from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            System.out.println("Student data from " + inputFile + ":");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}

        
        
        
    
    

