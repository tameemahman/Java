
package scannertest;

import java.util.Scanner;


public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        
//        String greetings;
//        
//        System.out.println("pls enter greetings");
//        greetings = sc . nextLine();
//        
//        System.out.println(greetings + " JAVA");
//        
//    }
//    
//}


//
//int n1, n2;
//        System.out.println("pls enter number 1 ");
//   
//    n1=sc.nextInt();
//    
//    
//        System.out.println("pls enter number 2 ");
//        
//        n2=sc.nextInt();
//        
//        int result = n1 + n2;
//        System.out.println("The total of two number is " + result);


//int number, sum=0 ;
// for (int i=1; i<=10; i++){
//     System.out.println("pls enter number " + i);
// number=sc.nextInt();
// sum +=number;
//         }
//
//        System.out.println("Total is " + sum);

//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("enter a number for radius: ");
//        
//        double radius = input.nextDouble();
//        
//        double area = radius * radius * 3.14159;
//        
//        System.out.println("The area for the circle of radius " + radius + " is " + area);
//    }
//}
//
//int sum = 0;
//int n=3;
//for (int i=1 ; i<=n ; i++){
//int number =sc.nextInt();
//sum += number;
//}
//        System.out.println(sum) ;}}



int sum=0;
int number = sc.nextInt();

for (int i=1; i<=number; i++){
    System.out.println("pls enter" + i);
    int input = sc.nextInt();
    sum += input;
    
    }
        System.out.println("Total is " + sum);
    }

    }