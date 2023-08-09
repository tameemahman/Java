
package class_test;

import java.util.Arrays;


public class Class_test {

   
    public static void main(String[] args) {
      
//        int[] numbers = new int[10];
//        
//      
//        
//        }
//        
//        for (int i=0 ; i<numbers.length; i++){
//        numbers[i] = (int)(Math.random()*100);
//        
//        }
//        
//        
//        
//        for (int number:numbers){
//            System.out.println(number);}
//        System.out.println(Arrays.toString(numbers));
        int [] test = new int[10];
        
          int max= 0 ; int min= 999;
        
        for (int i = 0 ; i< test.length; i++){
            
            int random = (int) (Math.random()* 100);
            test[i] = random ; 
            
            if(test[i] >max){
            max = test[i];
            }
            else if(test [i] < min){
            min = test [i];
            
            }
            System.out.println("random " + test[i]);
        }
        
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);
        
            
            
       
        
       
        
        
    }
    
}
