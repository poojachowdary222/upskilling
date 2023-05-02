package day2;

public class MOMOAnimalMain {
	   public static void main(String[] args) {
	      MOMOAnimal animal = new MOMOAnimal();
	      Dog dog = new Dog();
	      
	      animal.makeSound(); // Output: The animal makes a sound
	      dog.makeSound(); // Output: The dog barks
	      dog.makeSound(3); // Output: Woof! Woof! Woof!
	   }
	}