package day2;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {

		
		        int[] arr = {1, 2, 3, 4, 5};
		        System.out.println("Original array: " + Arrays.toString(arr));
		        
		        int[] reversedArr = reverseArray(arr);
		        System.out.println("Reversed array: " + Arrays.toString(reversedArr));
		    }
		    
		    public static int[] reverseArray(int[] arr) {
		        int[] reversedArr = new int[arr.length];
		        
		        for (int i = 0; i < arr.length; i++) {
		            reversedArr[arr.length - 1 - i] = arr[i];
		        }
		        
		        return reversedArr;
		    

		
	}

}
