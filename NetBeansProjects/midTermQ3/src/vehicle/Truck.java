
package vehicle;


public class Truck {
    
    
    class Vehicle {
    int speed;
    double regularPrice;
    String color;

    double getSalePrice() {
        return regularPrice;
    }
}
    
    
    
    class Truc extends Vehicle {
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
    
    

