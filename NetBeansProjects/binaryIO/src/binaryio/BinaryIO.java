package binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryIO {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
 String[] strings = {"John", "Susan", "Kim"};
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\hi.dat");

            ObjectOutputStream objectOutputStream;
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(numbers);
                objectOutputStream.writeObject(strings);
            }
            catch (IOException ex) {
                Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {

        }

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\hi.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            
            int [] newNumbers = (int []) inputStream.readObject();
            String [] newStrings = (String[]) inputStream.readObject();
            System.out.println(Arrays.toString(newNumbers));    
            System.out.println(Arrays.toString(newStrings));    
            
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
