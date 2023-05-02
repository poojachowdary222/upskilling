package day3;

public class Super1 extends Super {

	
	    Super1(String name) {
	        super(name);
	    }

	    @Override
	    void speak() {
	        super.speak();
	        System.out.println(name + " barks.");
	    }
	}
	

