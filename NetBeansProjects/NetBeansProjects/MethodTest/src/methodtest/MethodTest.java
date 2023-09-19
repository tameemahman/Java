
package methodtest;

import domath.DoMath;
import java.util.Scanner;


public class MethodTest {

    
    public static void main(String[] args) {
        DoMath dm=new DoMath();
        Scanner in=new Scanner(System.in);
        
        
        
        System.out.println(" PLease enter 1st number ");
        int n1 = in.nextInt();
        
        
        System.out.println("Please enter 2nd number ");
        int n2 = in.nextInt();
        
        
        
        System.out.println(dm.doSum(n1, n2));
        
    }
    
}
