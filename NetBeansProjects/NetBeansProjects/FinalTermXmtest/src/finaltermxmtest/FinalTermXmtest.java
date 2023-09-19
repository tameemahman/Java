
package finaltermxmtest;

import vehicleManagment.Vehicle;


public class FinalTermXmtest {

   
    public static void main(String[] args) {
         Vehicle car=new Car("A-2020", "BMW", 2020);
        Vehicle motorCycle=new MotorCycle("LA-40-7274", "MT-15", 2021);
        
        car.start();
        car.stop();
        car.details();
        
        motorCycle.start();
        motorCycle.stop();
        motorCycle.details();
    }

    private static class MotorCycle extends Vehicle {

        public MotorCycle(String lA407274, String mT15, int i) {
        }

        @Override
        public void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void stop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
