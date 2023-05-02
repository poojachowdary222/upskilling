package nonfsdpractice;
import java.util.Scanner;

public class SumOfIntegers{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i = 1, sum = 0;

        System.out.print("Enter a positive integer: ");
        num = input.nextInt();

        do {
            sum += i;
            i++;
        } while (i <= num);

        System.out.println("The sum of all numbers from 1 to " + num + " is " + sum + ".");
    }
}

