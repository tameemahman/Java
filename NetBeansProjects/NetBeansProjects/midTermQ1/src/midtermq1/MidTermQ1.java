package midtermq1;

import java.util.Scanner;

public class MidTermQ1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;

        System.out.println("Enter positive integers & negative integer to stop.");

        while (true) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            } else if (num > 0) {
                totalSum += num;
            } else {
                System.out.println("Zero is not a positive integer. Please enter a positive integer.");
            }
        }

        System.out.println("Sum of positive integers: " + totalSum);
        scanner.close();
    }
}


    

