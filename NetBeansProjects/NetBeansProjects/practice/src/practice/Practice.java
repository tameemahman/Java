package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a number between 0 to 1000 ");

        int number = in.nextInt();

//        if
//        int firstDigit = number / 100; 
//        int remainder = number % 100;
//        int secondDigit = remainder /10;
//        remainder = remainder % 10 ;
//        
//        
//        int result = firstDigit + secondDigit + remainder; 
//        System.out.println(result);             
        int extra = number / 1000;
        int extra1 = number % 1000;

        int first = extra1 / 100;
        int first1 = extra1 % 100;

        int second = first1 / 10;
        int second2 = first1 % 10;

        int sum = extra + first + second + second2;

        System.out.println("The sum is " + sum);

    }

}
