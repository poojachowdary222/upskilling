package day3;

public class VehicleMotorcycle extends Vehicle {
    private int numWheels;

    public VehicleMotorcycle(String make, String model, String year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    void display() {
    	System.out.println("VehicleMotorcycle");
    	super.display();
    	System.out.println("numWheels :" +numWheels);
    
    /*public int getNumWheels() {
        return numWheels;
    }*/
}
}