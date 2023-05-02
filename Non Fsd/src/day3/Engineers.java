package day3;

public class Engineers extends Employees{
	private String task;

	public Engineers(String name,int id,int salary,String task) {

	super(name,id,salary);
	this.task = task;
	 }
	void printDetails() {
		System.out.println("Engineers " );
		super.printDetails();
		System.out.println("task :" + task);
	} 

}
