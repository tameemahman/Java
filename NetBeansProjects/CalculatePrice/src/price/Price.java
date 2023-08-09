
package price;


public class Price {
   
    private int Quantity;
    private double unitPric;

    public Price() {
    }

    public Price(int Quantity, double unitPric) {
        this.Quantity = Quantity;
        this.unitPric = unitPric;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getUnitPric() {
        return unitPric;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setUnitPric(double unitPric) {
        this.unitPric = unitPric;
    }
    
    public void calculateTotalPrice(int n1, double n2 ){
    
    int totalPrice = Quantity*(int) unitPric;
    
        System.out.println("The total Price is " + totalPrice);
        double discount = totalPrice*.05;
         
        if (totalPrice>=100){
            System.out.println(" You have to pay with discount "  + (totalPrice-discount));
              }
        else{
            System.out.println("You have to pay without discount " + totalPrice);}
    
    
    
    }
}
