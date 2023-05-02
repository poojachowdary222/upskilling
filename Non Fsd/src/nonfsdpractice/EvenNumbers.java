package nonfsdpractice;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        input.close();

        System.out.print("Even numbers from 2 to " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}