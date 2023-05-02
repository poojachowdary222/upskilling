package day2;
import java.util.HashMap;

public class CountingRepeatedValues {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 5};
	        
	        // create a HashMap to store the count of each element
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < arr.length; i++) {
	            if (map.containsKey(arr[i])) {
	                // if the element already exists in the map, increment its count
	                map.put(arr[i], map.get(arr[i]) + 1);
	            } else {
	                // if the element does not exist in the map, add it with count 1
	                map.put(arr[i], 1);
	            }
	        }
	        
	        // iterate through the map and print the count of each repeated element
	        for (Integer key : map.keySet()) {
	            if (map.get(key) > 1) {
	                System.out.println(key + " repeated " + map.get(key) + " times");
	            }
	        }
	    }
	}
	
	
