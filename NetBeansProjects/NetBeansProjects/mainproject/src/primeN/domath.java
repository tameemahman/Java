
package primeN;

import java.util.Scanner;


public class domath {
    
    public String domath (int input){
        String in="prime";
      
        int sum=0;
    for (int i=1;i<=input; i++){
    if (input %i== 0){
    sum=sum+1;
    
    }
       }
    if (sum==2){
    return " Prime number ";
    }
    
    else {
    return " Not prime";
            }
    
    
    
    }
    
}
