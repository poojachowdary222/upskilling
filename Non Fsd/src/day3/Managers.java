package day3;

 public class Managers extends Employees{
private String dailyReports;

public Managers(String name,int id,int salary,String dailyReports) {

super(name,id,salary);
this.dailyReports = dailyReports;
 }
void printDetails() {
	System.out.println("Managers " );
	super.printDetails();
	System.out.println("dailyReport :" + dailyReports);
}
}
