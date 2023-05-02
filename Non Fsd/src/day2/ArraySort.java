package day2;

import java.util.Arrays;

public class ArraySort {

	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 8, 4, 1, 9, 6, 3, 7};
	        
	        Arrays.sort(numbers);
	        
	        System.out.println("Sorted numbers:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}

	

