package day3;

public class Constructor {

	
	
	    private String name;
	    private int age;

	    // Default constructor
	    public Constructor() {
	        this.name = "John Doe";
	        this.age = 18;
	    }

	    // Parameterized constructor
	    public Constructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public static void main(String[] args) {
	        // Creating objects using default and parameterized constructors
	    	Constructor person1 = new Constructor();
	    	Constructor person2 = new Constructor("Jane Smith", 25);

	        // Printing the details of the objects
	        System.out.println("Details of person1:");
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());

	        System.out.println("\nDetails of person2:");
	        System.out.println("Name: " + person2.getName());
	        System.out.println("Age: " + person2.getAge());
	    }
	}

	

