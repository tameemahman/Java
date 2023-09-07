package write.readafile;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class WriteReadafile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\Desktop\\yuu!.txt");
        Scanner read = new Scanner(file);
//        PrintWriter pw = new PrintWriter(file);
//        
//        pw.println("Hello Java ");
//        
//        pw.close();

        if (file.exists()) {
            String tenWord = "";
            int count = 0;

            while (read.hasNext()) {
                String word = read.next();
                tenWord += word + " ";
                count++;

                if (count == 10) {
                    System.out.println(tenWord);
                    count = 0;
                    tenWord = "";

                }

            }

         
        } else {
            System.out.println("File is empty");
        }
        read.close();
    }

}

//        if (file.exists()) {
//            int wordCount = 0;
//            while (read.hasNext()) {
//                String word = read.next();
//                wordCount++;
//                System.out.print(word + " ");
//                if (wordCount % 10 == 0) {
//                    System.out.println();
//                }
//            }
//            if (wordCount % 10 != 0) {
//                System.out.println();
//            }
//            if (wordCount == 0) {
//                System.out.println("File is empty");
//            }
//        } else {
//            System.out.println("File does not exist");
//        }
//
//        read.close();
//    }
//
//}
