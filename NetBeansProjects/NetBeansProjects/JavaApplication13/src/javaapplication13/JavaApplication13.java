
package javaapplication13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaApplication13 {

   
    public static void main(String[] args) {
       
        
//        ArrayList < Integer > arrayList = new ArrayList<Integer>(); //integer wrapper class
//        
//        arrayList.add(20);
//        
//        System.out.println(" Add " + arrayList);
//        
//        
//     


        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do{
        try{
            System.out.println("Enter an Integer : ");
        int number = input.nextInt();
        
        
            System.out.println("The number entered is : " + number);

continueInput = false;
       }
        
        catch (InputMismatchException ex){
            System.out.println("Try again" + "Incorrect input: an integer is required ");
        
            
            input.nextLine();
                
                }
        
        
        }
        while (continueInput);
        
    }
    
}
