package day3;

public class Vehicle {
    private String make;
    private String model;
    private String year;

    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
void display()
{
	System.out.println("make:" + make);
	System.out.println("model:" + model);
	System.out.println("year:" + year);
	
}
   /* public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }*/
}







