package day2;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the Fibonacci series: ");
        int limit = sc.nextInt();

        int[] fib = new int[limit];

        // First two elements of the array are always 0 and 1
        fib[0] = 0;
        fib[1] = 1;

        // Generate the rest of the series using a loop
        for (int i = 2; i < limit; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        // Print out the series
        System.out.println("The Fibonacci series up to " + limit + " is:");
        for (int i = 0; i < limit; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
