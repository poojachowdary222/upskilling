package day3;

public class Shape1 {
	public static void main(String[] args) {
	    Shape rectangle = new Shape("Rectangle", 5.0, 10.0);
	    double area = rectangle.calculateArea();
	    System.out.println(rectangle.getName() + " has an area of " + area + ".");
	}

}
