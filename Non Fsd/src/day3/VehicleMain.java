package day3;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VehicleCar vc;
VehicleTruck vt;
VehicleMotorcycle vm;
		
		vc = new VehicleCar("tyresmaking","nano","1999",123);
		vt = new VehicleTruck("enginemaking","audi","2000",234);
		vm = new VehicleMotorcycle("glassmaking","ault","2030",789);
		
		vc.display();
		vt.display();
		vm.display();
		
	}

}
