package nonfsdpractice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Calculate the factorial using a for loop
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}

