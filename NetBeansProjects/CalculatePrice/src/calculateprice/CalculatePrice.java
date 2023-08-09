
package calculateprice;

import java.util.Scanner;
import price.Price;


public class CalculatePrice {

    
    public static void main(String[] args) {
       
        Price total = new Price();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter Quantity ");
        int input1 = sc.nextInt();
        System.out.println("Please enter Double Price ");
        double input2 =sc.nextDouble();
        
        
        total.setQuantity(input1);
        total.setUnitPric(input2);
        
        total.calculateTotalPrice(input1, input2);
        
        
    }
    
}
