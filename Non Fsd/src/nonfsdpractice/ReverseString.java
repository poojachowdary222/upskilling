package nonfsdpractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Use a for loop to reverse the string
        String reverseString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString += inputString.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reverseString);
    }
}
