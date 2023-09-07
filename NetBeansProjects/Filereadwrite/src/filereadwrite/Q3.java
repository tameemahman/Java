package filereadwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        Object[] inputs = {
            "Pranto", 45,
            "Sabit", 34,
            "Limon", 42
        };

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
            ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);

            objectOutput.writeObject(inputs);
            objectOutput.close();

            FileInputStream fileInputStream = new FileInputStream("student.dat");
            ObjectInput objectInput = new ObjectInputStream(fileInputStream);

            Object[] read = (Object[]) objectInput.readObject();
            objectInput.close();

            System.out.println(Arrays.toString(read));
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
