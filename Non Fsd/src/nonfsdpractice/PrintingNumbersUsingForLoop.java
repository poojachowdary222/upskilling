package nonfsdpractice;

import java.util.Scanner;

public class PrintingNumbersUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        input.close();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
