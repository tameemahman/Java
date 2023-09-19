
package mainproject;

import java.util.Scanner;
import primeN.domath;


public class Mainproject {

    
    public static void main(String[] args) {
       
        domath sum = new domath();
        System.out.println("  please enter number  ");
               Scanner sc= new Scanner(System.in);
           int input=sc.nextInt();
           
         System.out.println(input + " is" + sum.domath(input) );
        
        
    }
    
}
