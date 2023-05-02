package day2;

public class MethodExample {
	  
	  // Method overloading
	  public static int add(int x, int y) {
	    return x + y;
	  }
	  
	  public static double add(double x, double y) {
	    return x + y;
	  }
	  
	  // Method overriding
	  public static class Shape {
	    public void draw() {
	      System.out.println("Drawing shape");
	    }
	  }
	  
	  public static class Circle extends Shape {
	    @Override
	    public void draw() {
	      System.out.println("Drawing circle");
	    }
	  }
	  
	  public static void main(String[] args) {
	    // Method overloading example
	    System.out.println(add(5, 10));
	    System.out.println(add(5.5, 10.5));
	    
	    // Method overriding example
	    Shape shape = new Shape();
	    Circle circle = new Circle();
	    shape.draw();
	    circle.draw();
	  }
	}

