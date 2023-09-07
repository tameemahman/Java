
package vehiclemanagement;

import travel.Car;
import travel.Motor;
import travel.Vehicle;


public class VehicleManagement {

  
    public static void main(String[] args) {
        Vehicle ca=new Car("BMW", "Yamaha", 44);
        
        Vehicle mt=new Motor("jkhgh", "unyu", 550);
        
        ca.start();
        mt.stop();
        ca.printDetails();
    }
    
}
