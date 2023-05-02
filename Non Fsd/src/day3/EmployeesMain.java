package day3;

public class EmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineers e;	
		Managers m;
		Interns i;
		
		
 e = new Engineers("ram",1,100000,"work");
 m =  new Managers("sam",2,200000,"checking");
 i =  new Interns("jan",3,30000,"learning");
 e.printDetails();
 m.printDetails();
 i.printDetails();
	}

}
