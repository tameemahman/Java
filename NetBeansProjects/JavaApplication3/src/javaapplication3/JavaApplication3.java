
package javaapplication3;

import java.util.Scanner;


public class JavaApplication3 {

  
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
//        
//      int number;
//      int sum=0;
//        System.out.println("Please enter a number ");
//      number = sc.nextInt();
//        
//        while(number>0){
//            sum += number;
//            System.out.println("Pleas enter a number ");
//            number = sc.nextInt();
//           }
//        System.out.println(sum);

        System.out.println(" please enter price ");
        double price = sc. nextDouble();
        
        System.out.println("Please enter Tax rate ");
        double tax = sc.nextDouble();
//        double taxRate=tax/100;
        double actualPrice = price + price*(tax/100);
        // double actualPrice= price + (price*taxRate);
        
        System.out.println("Actual price is " + actualPrice);
        
        
    }
}
            
    
    
    
    

