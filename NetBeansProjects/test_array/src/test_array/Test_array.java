
package test_array;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Test_array {

   
    public static void main(String[] args) {
       
        
        String[] studentNames = new String[10];
        
        studentNames[0] = "Rajib";
        studentNames[1] = "Faysal";
        studentNames[2] = "Robiul";
        studentNames[3] = "Sabit";
        studentNames[4] = "Robiul";
        
        System.out.println(Arrays.toString(studentNames));


int [] marks = new int [10];
marks[0] =20;
marks[1] =30;
marks[2] =40;
marks[3] =50;
marks[4] =60;
  
 for (int j:marks){
        System.out.println(j);
 
  }
    
 for (int i= 0; i<marks.length; i++){
     System.out.println("The mark is  " + marks[i] + "and the name is " + studentNames[i]    );
     
 }
 
}}
