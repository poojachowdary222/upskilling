package day3;

public class ThisKeyword {

	
	    private String name;
	    private int age;

	    public ThisKeyword(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void printInfo() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	    }
	}

	