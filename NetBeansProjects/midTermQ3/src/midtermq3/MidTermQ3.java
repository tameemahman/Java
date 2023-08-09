package midtermq3;

import java.util.Scanner;

public class MidTermQ3 {

    public static void main(String[] args) {

        class Vehicle {

            int speed;
            double regularPrice;
            String color;

            double getSalePrice() {
                return regularPrice;
            }
        }

        class Truck extends Vehicle {

            int weight;

            @Override
            double getSalePrice() {
                if (weight > 2000) {
                    return regularPrice * 0.9; // 10% discount
                } else {
                    return regularPrice;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);

        Truck truck = new Truck();
        System.out.print("Enter regular price of the truck: ");
        truck.regularPrice = scanner.nextDouble();
        System.out.print("Enter weight of the truck: ");
        truck.weight = scanner.nextInt();

        scanner.close();

        System.out.println("Truck sale price: " + truck.getSalePrice());
        
        
        
        
    }
}









