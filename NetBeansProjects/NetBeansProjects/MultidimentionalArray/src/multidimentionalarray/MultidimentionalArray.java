
package multidimentionalarray;

import java.util.Scanner;


public class MultidimentionalArray {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row nuomber ");
        int row = s.nextInt();

        System.out.println("Enter Column nuomber ");
        int col = s.nextInt();

        TwoArrayInMethod sum= new TwoArrayInMethod();
        
        int[][] newArray = sum .creatArray(row, col);
        
        int sumOfArray = sum.doSum(newArray);
        System.out.println(sumOfArray);
        
    }
    
}
