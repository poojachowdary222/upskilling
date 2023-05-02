package day2;

import java.util.*;

public class DupilicateFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 5};
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
            }
        }
        
        // Print the count of duplicates
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 1) {
                System.out.println(key + " appears " + freqMap.get(key) + " times.");
            }
        }
        
        // Remove duplicates from the array
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }
}

