package day3;

public class EncapsulationDemo {

	public static void main(String[] args) {
        Encapsulation p = new Encapsulation();
        p.setName("John");
        p.setAge(30);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's age: " + p.getAge());
    }
	
}
