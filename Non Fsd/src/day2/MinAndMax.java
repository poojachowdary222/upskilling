package day2;

public class MinAndMax {

	public static void main(String[] args) {
	    int[] numbers = { 5, 3, 8, 2, 7 };
	    int min = numbers[0];
	    int max = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        if (numbers[i] < min) {
	            min = numbers[i];
	        }
	        if (numbers[i] > max) {
	            max = numbers[i];
	        }
	    }
	    System.out.println("Minimum value: " + min);
	    System.out.println("Maximum value: " + max);
	}
	
	
}
