package nonfsdpractice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three integers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest integer is: " + max);
    }
}
