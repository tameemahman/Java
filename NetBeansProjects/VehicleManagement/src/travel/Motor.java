
package travel;


public class Motor extends Vehicle{

    public Motor() {
    }

    public Motor(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    
    @Override
    public void start() {
         System.out.println("Motor start");
    }

    @Override
    public void stop() {
        System.out.println("MOTOR start");
    }

    @Override
    public void printDetails() {
        super.printDetails(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
