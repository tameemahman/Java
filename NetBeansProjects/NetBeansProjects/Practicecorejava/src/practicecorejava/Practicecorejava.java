
package practicecorejava;

import java.util.Scanner;


public class Practicecorejava {

    public static void main(String[] args) {
      
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a random number ");
        int number = sc.nextInt();
         System.out.println("0");
        
        for (int i=0; i<number; i++){
            System.out.println(fibonacci(i)  +  " "); 
        }
    }
        public static  int fibonacci(int k ){
        if(k<=0){
            return 1 ;
         }
        else{
        return fibonacci(k-1) + fibonacci(k-2);
        }
                }
        
    
    
}
