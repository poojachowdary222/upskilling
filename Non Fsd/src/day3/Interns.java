package day3;

public class Interns extends Employees{
	private String report;

	public Interns(String name,int id,int salary,String report) {

	super(name,id,salary);
	this.report = report;
	 }
	void printDetails() {
		System.out.println("Interns " );
		super.printDetails();
		System.out.println("report :" + report);
	}

}
