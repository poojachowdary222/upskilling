package day3;

public class VehicleCar extends Vehicle {
    private int numDoors;

    public VehicleCar(String make, String model, String year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
void display() {
	System.out.println("VehicleCar");
	super.display();
	System.out.println("numDoors :" +numDoors);
}
   /* public int getNumDoors() {
        return numDoors;
    }*/
}