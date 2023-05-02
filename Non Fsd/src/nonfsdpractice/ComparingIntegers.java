package nonfsdpractice;

import java.util.Scanner;

public class ComparingIntegers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the first integer: ");
      int num1 = input.nextInt();

      System.out.print("Enter the second integer: ");
      int num2 = input.nextInt();

      if (num1 > num2) {
         System.out.println(num1 + " is greater than " + num2);
      } else if (num1 < num2) {
         System.out.println(num1 + " is less than " + num2);
      } else {
         System.out.println(num1 + " is equal to " + num2);
      }
   }
}
