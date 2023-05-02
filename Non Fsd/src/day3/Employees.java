package day3;

public class Employees {

	private String name;
	private int id;
	private int salary;
	
	
	public Employees(String name, int id, int salary) {
		
	
		this.name = name;
		this.id = id;
		this.salary= salary;
	}
		void printDetails() {
			System.out.println("name :"+ name);
			System.out.println("id"+ id);
			System.out.println("salary :"+ salary);
		
			
	}
}
