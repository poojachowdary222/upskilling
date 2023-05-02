package day3;

public class VehicleTruck extends Vehicle {
    private int towingCapacity;

    public VehicleTruck(String make, String model, String year, int towingCapacity) {
        super(make, model, year);
        this.towingCapacity = towingCapacity;
    }
    void display() {
    	System.out.println("VehicleTruck");
    	super.display();
    	System.out.println("towingCapacity :" +towingCapacity);
    }
    
   /* public int getTowingCapacity() {
        return towingCapacity;
    }*/
}
