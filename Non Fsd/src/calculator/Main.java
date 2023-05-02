package calculator;

//Main.java
import calculator.Addition;
import calculator.Substraction;
import calculator.Multiplication;
import calculator.Division;

public class Main {
 public static void main(String[] args) {
     double num1 = 10.0;
     double num2 = 5.0;
     
     double sum = Addition.add(num1, num2);
     double difference = Substraction.subtract(num1, num2);
     double product = Multiplication.multiply(num1, num2);
     double quotient = Division.divide(num1, num2);
     
     System.out.println("Sum: " + sum);
     System.out.println("Difference: " + difference);
     System.out.println("Product: " + product);
     System.out.println("Quotient: " + quotient);
 }
}

