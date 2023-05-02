package day2;

public class OccurenceInteger {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};

        int target = 9;
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        System.out.println("The number of times " + target + " appears in the array is: " + count);
    }
}

