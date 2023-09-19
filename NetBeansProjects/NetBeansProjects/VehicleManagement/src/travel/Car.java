package travel;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void printDetails() {
        super.printDetails(); //To change body of generated methods, choose Tools | Templates.
    }

}
